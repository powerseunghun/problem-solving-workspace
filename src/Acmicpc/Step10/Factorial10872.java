package Acmicpc.Step10;

import java.util.Scanner;

public class Factorial10872 {
	public int factorial(int n) {
		if (n == 0) return 1;
		else return n * factorial(n - 1);
	}
	public static void main(String[] args) {
		System.out.println(new Factorial10872().factorial(new Scanner(System.in).nextInt()));
	}
}
