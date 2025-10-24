package Acmicpc.As.B3.ThirtyThousandth.Two.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SõnakuulelikTom32728 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), S = null, A = "", B = "", C = "";
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		S = br.readLine();
		
		for (int i = 0; i < N; i++) {
			char c = S.charAt(i);
			switch(c) {
			case 's':
				if (A.length() < K) {
					A += 's';
				} else if (B.length() < K) {
					B += 's';
				} else {
					C += 's';
				}
				break;
			case 'r':
				if (B.length() < K) {
					B += 'r';
				} else if (C.length() < K) {
					C += 'r';
				} else {
					A += 'r';
				}
				break;
			default:
				if (C.length() < K) {
					C += 'p';
				} else if (A.length() < K) {
					A += 'p';
				} else {
					B += 'p';
				}
				break;
			}
		}
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		br.close();
	}
}
