package basic;

import java.util.Scanner;

public class RecursionFibonacci {
	public long fibonacci(int n) {
		if (n <= 2) return 1;
		return fibonacci(n-2) + fibonacci(n-1);
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		System.out.println(new RecursionFibonacci().fibonacci(n));
	}
}
