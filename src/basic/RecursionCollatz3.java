package basic;

import java.util.Scanner;

public class RecursionCollatz3 {
	public void collatz(int n) {
		if (n == 1) {
			System.out.println(n);
			return;
		}
		else {
			if (n % 2 != 0) collatz(n * 3 + 1);
			else collatz(n / 2);
		}
		System.out.println(n);
	}
	public static void main(String[] args) {
		new RecursionCollatz3().collatz(new Scanner(System.in).nextInt());
	}
}
