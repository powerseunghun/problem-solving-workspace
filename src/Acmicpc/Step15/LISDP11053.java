package Acmicpc.Step15;

import java.util.Scanner;

public class LISDP11053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), max = 0;
		int[] arr = new int[N];
		int[] dpArr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		dpArr[0] = 1;
		for (int i = 1; i < N; i++) {
			dpArr[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dpArr[i] < dpArr[j] + 1) {
					dpArr[i] = dpArr[j] + 1;
				}
				max = dpArr[j] >= max ? dpArr[j] : max;
			}
		}
		for (int value : dpArr) {
			max = max >= value ? max : value;
		}
		System.out.println(max);
	}
}
