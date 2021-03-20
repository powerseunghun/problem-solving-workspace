package Acmicpc.Step14;

import java.util.Scanner;

public class BitonicSequenceLISDP11054 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), max = 0;
		int[] arr = new int[N];
		int[] dpLeft = new int[N], dpRight = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		dpLeft[0] = 1;
		for (int i = 1; i < N; i++) {
			dpLeft[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dpLeft[i] < dpLeft[j] + 1) {
					dpLeft[i] = dpLeft[j] + 1;
				}
			}
		}
		
		dpRight[N-1] = 1;
		
		for (int i = N-2; i >= 0; i--) {
			dpRight[i] = 1;
			for (int j = N-1; j > i; j--) {
				if (arr[i] > arr[j] && dpRight[i] < dpRight[j] + 1) {
					dpRight[i] = dpRight[j] + 1;
				}
			}
		}
		
		// 중복제거 1 생각하도록
		for (int i = 0; i < dpLeft.length; i++) {
			int tmp = dpLeft[i] + dpRight[i] - 1;
			max = tmp >= max ? tmp : max;
		}
		
		System.out.println(max);
	}
}
