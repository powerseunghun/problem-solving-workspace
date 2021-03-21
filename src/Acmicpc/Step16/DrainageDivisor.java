package Acmicpc.Step16;

import java.util.Scanner;

public class DrainageDivisor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int A = 0, B = 0;
		while(true) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			if (A == 0 && B == 0) break;
			
			if (B % A == 0) sb.append("factor\n");
			else if (A % B == 0) sb.append("multiple\n");
			else sb.append("neither\n");
		}
		System.out.println(sb);
	}
}
