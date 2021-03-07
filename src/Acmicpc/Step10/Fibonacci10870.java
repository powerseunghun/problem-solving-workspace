package Acmicpc.Step10;

import java.util.Scanner;

public class Fibonacci10870 {
	public int fibo(int n) {
		if (n == 0) return 0;
		else if (n == 1) return 1;
		else return fibo(n - 1) + fibo(n - 2);
	}
	public static void main(String[] args) {
		System.out.println(new Fibonacci10870().fibo(new Scanner(System.in).nextInt()));
	}
}
