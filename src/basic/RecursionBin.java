package basic;

import java.util.Scanner;

public class RecursionBin {
	public void bin(int n) {
		if (n == 0 || n == 1) {
			System.out.print(n);
		}
		else {
			bin(n / 2);
			System.out.print(n % 2);
		}
		return;
	}
	public static void main(String[] args) {
		new RecursionBin().bin(new Scanner(System.in).nextInt());
	}
}
