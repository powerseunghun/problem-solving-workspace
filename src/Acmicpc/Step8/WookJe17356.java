package Acmicpc.Step8;

import java.util.Scanner;

public class WookJe17356 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A = sc.nextDouble(), B = sc.nextDouble();
		double M = (B - A) / 400;
		
		System.out.println(1 / (Math.pow(10, M) + 1));
	}
}
