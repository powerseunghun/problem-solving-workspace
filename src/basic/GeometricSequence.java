package basic;

import java.util.Scanner;

public class GeometricSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, r, n;
		a = sc.nextInt();
		r = sc.nextInt();
		n = sc.nextInt();
		System.out.println((long) (a * Math.pow(r, n-1)));
	}
}
