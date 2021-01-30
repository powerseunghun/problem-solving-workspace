package basic;

import java.util.Scanner;

public class RecursionSum {
	public int sum(int n) {
		if (n <= 0) return 0;
		else {
			return n + sum(n-1);
		}
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		System.out.println(new RecursionSum().sum(n));
	}
}
