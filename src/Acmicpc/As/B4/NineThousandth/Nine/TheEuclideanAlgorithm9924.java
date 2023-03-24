package Acmicpc.As.B4.NineThousandth.Nine;

import java.util.Scanner;

public class TheEuclideanAlgorithm9924 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt(), res = 0, tVal = 0;
		
		while (A != B) {
			res++;
			tVal = Math.max(A, B) - Math.min(A, B);
			B = Math.min(A, B);
			A = tVal;
		}
		
		System.out.println(res);
	}
}
