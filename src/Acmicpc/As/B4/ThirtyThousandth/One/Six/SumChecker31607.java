package Acmicpc.As.B4.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumChecker31607 {
	static int A = 0, B = 0, C = 0;
	static boolean checker() {
		return (A == B+C || B == A+C || C == A+B);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		System.out.println(checker() ? "1" : "0");
		br.close();
	}
}
