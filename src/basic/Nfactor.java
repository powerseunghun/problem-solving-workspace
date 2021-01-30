package basic;

import java.util.Scanner;

public class Nfactor {
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) count++;
		}
		
		System.out.print(count);
	}
}
