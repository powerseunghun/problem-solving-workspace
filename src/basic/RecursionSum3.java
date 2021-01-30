package basic;

import java.util.Scanner;

public class RecursionSum3 {
	public int sum(int n) {
		if (n <= 0) return 0;
		else return n + sum(n-1);
	}
	public static void main(String[] args) {
		System.out.println(new RecursionSum3().sum(new Scanner(System.in).nextInt()));
	}
}
