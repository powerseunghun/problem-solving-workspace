package basic;

import java.util.Scanner;

public class Factorization {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt(), c = sc.nextInt(), x;
		int D = (b * b) - (4 * 1 * c);
		
		if (D > 0) {
			x = (int) ((-1 * b) + Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
			x = (int) ((-1 * b) - Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
		}
		else if (D == 0) {
			x = (int) ((-1 * b) + Math.sqrt(D));
			if (x < 0) System.out.println("x+" + ((x/2) * -1));
			else System.out.println("x" + ((x/2) * -1));
		}
		else {
			System.out.println(-1);
		}
	}
}
