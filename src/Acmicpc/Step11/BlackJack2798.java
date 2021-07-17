package Acmicpc.Step11;

import java.util.Scanner;

public class BlackJack2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, tmp, min = 0;
		int[] nums;
		N = sc.nextInt();
		M = sc.nextInt();
		nums = new int[N];
		for (int i = 0; i < N; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					tmp = nums[i] + nums[j] + nums[k];
					if (tmp > min && tmp <= M) {
						min = tmp;
					}
				}
			}
		}
		System.out.println(min);
	}
}