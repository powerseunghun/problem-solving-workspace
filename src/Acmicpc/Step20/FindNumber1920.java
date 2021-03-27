package Acmicpc.Step20;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumber1920 {
	public static boolean binarySearch(int[] arr, int target) {
		int left = 0, right = arr.length-1, mid = arr.length / 2;
		boolean flag = false;
		while(left <= right) {
			if (target == arr[mid]) {
				flag = true;
				break;
			}
			
			else if (target > arr[mid]) {
				left = mid + 1;
				mid = (left + right) / 2;
			}
			else {
				right = mid - 1;
				mid = (left + right) / 2;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = 0;
		int[] list1 = new int[N], list2 = null;
		
		for (int i = 0; i < N; i++) {
			list1[i] = sc.nextInt();
		}
		Arrays.sort(list1);
		
		M = sc.nextInt();
		list2 = new int[M];
		for (int i = 0; i < M; i++) {
			list2[i] = sc.nextInt();
			if (binarySearch(list1, list2[i])) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
	}
}
