package basic;

import java.util.Scanner;

public class RecursionCollatz {
	public int collatz(int n, int c) {
		if (n == 1) return c;
		if (n % 2 != 0) {
			return collatz(n * 3 + 1, c + 1);
		}
		else {
			n = n / 2;
			return collatz(n, c + 1);
		}
	}
	public static void main(String[] args) {
		System.out.println(new RecursionCollatz().collatz(new Scanner(System.in).nextInt(), 1));
	}
}
