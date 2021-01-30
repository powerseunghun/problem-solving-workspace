package basic;

import java.util.Scanner;

public class RecursionCollatz2 {
	public void collatz(int n) {
		System.out.println(n);
		if (n == 1) return;
		else {
			if (n % 2 != 0) collatz(n * 3 + 1);
			else collatz(n / 2);
		}
	}
	public static void main(String[] args) {
		new RecursionCollatz2().collatz(new Scanner(System.in).nextInt());
	}
}
