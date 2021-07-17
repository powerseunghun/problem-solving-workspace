package Acmicpc.Step12;

import java.util.Scanner;

public class NSquareSort2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] nums = new int[N];
		int tmp;
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if (nums[i] > nums[j]) {
					tmp = nums[j];
					nums[j] = nums[i];
					nums[i] = tmp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}