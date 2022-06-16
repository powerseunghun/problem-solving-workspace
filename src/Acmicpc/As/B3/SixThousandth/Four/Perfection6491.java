package Acmicpc.As.B3.SixThousandth.Four;

import java.io.IOException;
import java.util.Scanner;

public class Perfection6491 {
	static String judgement(int N) {
		int sum = 0;
		for (int i = 1; i < N; i++) {
			if (N % i == 0) sum += i;
		}
		if (sum == N) return "PERFECT\n";
		else if (sum < N) return "DEFICIENT\n";
		else return "ABUNDANT\n";
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = 0;
		
		while (true) {
			N = sc.nextInt();
			if (N == 0) break;
			sb.append(N + " " + judgement(N));
		}
		
		System.out.print(sb.toString());
	}
}
