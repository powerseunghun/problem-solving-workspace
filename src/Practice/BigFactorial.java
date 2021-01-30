package Practice;

import java.util.Scanner;

public class BigFactorial {
	public void getFactorialAndPrint(int[] factorial, int n) {
		int carry = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = factorial.length - 1; j >= 0; j--) {
				factorial[j] = factorial[j] * i + carry;
				carry = factorial[j] / 10;
				factorial[j] %= 10;
			}
		}
		for (int i = 0; i < factorial.length; i++) {
			if (factorial[i] == 0) continue;
			for (int j = i; j < factorial.length; j++) {
				System.out.print(factorial[j]);
			}
			return;
		}
	}
	public static void main(String[] args) {
		int[] factorial = new int[1000];
		factorial[999] = 1;
		BigFactorial bf = new BigFactorial();
		bf.getFactorialAndPrint(factorial, new Scanner(System.in).nextInt());
		
	}
}
