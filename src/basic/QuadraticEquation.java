package basic;

import java.util.Scanner;

public class QuadraticEquation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int D = (b * b) - (4 * a * c);
		double x;
		
		if (D < 0) {
			x = Math.sqrt(Math.abs(D)) / (2.0 * a);
			System.out.printf("%.2f+%.2fi\n", (-1 * b) / (2.0 * a), Math.abs(x));
			System.out.printf("%.2f-%.2fi\n", (-1 * b) / (2.0 * a), Math.abs(x));
		}
		else if (D == 0) {
			x = (-1 * b) + Math.sqrt(D);
			System.out.printf("%.2f\n", x / (2.0 * a));
		}
		else {
			x = (-1 * b) + Math.sqrt(D);
			System.out.printf("%.2f\n", x / (2.0 * a));
			x = (-1 * b) - Math.sqrt(D);
			System.out.printf("%.2f\n", x / (2.0 * a));
		}
	}
}
