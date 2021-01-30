package basic;

import java.util.Scanner;

public class RecursionFibonacci2 {
	public int fibo(int n) {
		if (n <= 2) return 1;
		else return fibo(n-2) + fibo(n-1);
	}
	public static void main(String[] args) {
		System.out.println(new RecursionFibonacci2().fibo(new Scanner(System.in).nextInt()));
	}
}
