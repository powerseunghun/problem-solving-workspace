package Acmicpc.Step9;

import java.util.Scanner;

public class Factorization11653 {
	public static void main(String[] args) {
		int N = new Scanner(System.in).nextInt();
		double sqrtN = Math.sqrt(N);
		
		for (int i = 2; i <= sqrtN; i++) {
			while(N % i == 0) {
				System.out.println(i);
				N /= i;
			}
 		}
		if (N > 1) System.out.println(N);
	}
}
