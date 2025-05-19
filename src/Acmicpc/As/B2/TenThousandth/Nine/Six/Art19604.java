package Acmicpc.As.B2.TenThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Art19604 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), X = 0, Y = 0;
		int A = 100, B = 100, C = 0, D = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			X = Integer.parseInt(str.split(",")[0]);
			Y = Integer.parseInt(str.split(",")[1]);
			A = Math.min(A, X);
			B = Math.min(B, Y);
			C = Math.max(C, X);
			D = Math.max(D, Y);
		}
		
		System.out.println((A-1) + "," + (B-1));
		System.out.println((C+1) + "," + (D+1));
		br.close();
		
	}
}
