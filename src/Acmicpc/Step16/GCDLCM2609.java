package Acmicpc.Step16;

import java.util.Scanner;

public class GCDLCM2609 {
	public int GCD(int a, int b) {
		if (b == 0) return a;
		else {
			return GCD(b, a % b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = 0, B = 0, GCD = 0;
		
		A = sc.nextInt();
		B = sc.nextInt();
		GCD = new GCDLCM2609().GCD(A, B);
		
		System.out.println(GCD);
		System.out.println((A * B) / GCD);
	}
}
