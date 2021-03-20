package Acmicpc.Step15;

import java.util.Scanner;

public class Coin11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt(), cnt = 0;
		int[] coins = new int[N];
		
		for (int i = 0; i < N; i++) {
			coins[i] = sc.nextInt();
		}
		
		for (int i = N - 1; i >= 0; i--) {
			if (coins[i] <= K) {
				cnt += (K / coins[i]);
				K %= coins[i];
			}
		}
		
		System.out.println(cnt);
	}
}
