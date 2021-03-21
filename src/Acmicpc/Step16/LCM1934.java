package Acmicpc.Step16;

import java.util.Scanner;

public class LCM1934 {
	public int getGCD(int a, int b) {
		if (b == 0) return a;
		else return getGCD(b, a % b);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(), A = 0, B = 0;
		LCM1934 lcm = new LCM1934();
		
		for (int i = 0; i < T; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			
			System.out.println(A * B / lcm.getGCD(A, B));
		}
	}
}
