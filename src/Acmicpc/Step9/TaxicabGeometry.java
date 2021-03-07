package Acmicpc.Step9;

import java.util.Scanner;

public class TaxicabGeometry {
	public static void main(String[] args) {
		int R = new Scanner(System.in).nextInt();
		double PI = 3.14159265358979;
		System.out.printf("%.06f\n",(double)(R * R * PI));
		System.out.printf("%.06f\n",(double)(R * (2 * R)));
	}
}
