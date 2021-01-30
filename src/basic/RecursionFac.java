package basic;

import java.util.Scanner;

public class RecursionFac {
	public int fac(int n) {
		if (n <= 0) return 1;
		else return n * fac(n - 1);
	}
	public static void main(String[] args) {
		System.out.println(new RecursionFac().fac(new Scanner(System.in).nextInt()));
	}
}
