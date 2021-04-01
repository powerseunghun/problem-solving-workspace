package Acmicpc.Step1;

import java.util.Scanner;

public class StarPrint10995 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N * 2; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if (j % 2 == 0) {
						System.out.print(" ");
					}
					else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
