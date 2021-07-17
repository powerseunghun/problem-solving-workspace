package Acmicpc.Step17;

import java.util.Scanner;

public class BinomialCoefficient11050 {
	public int getBE(int n, int k) {
		if (k == 0 || n == k) return 1;
		else {
			return getBE(n-1, k) + getBE(n-1, k-1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		
		System.out.println(new BinomialCoefficient11050().getBE(n, k));
	}
}
