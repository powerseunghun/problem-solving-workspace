package Acmicpc.As.B3.TwentyThousandth.Four.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Muffinspelet24198 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double A = 0, B = 0, v = 0;
		
		for (int i = 0; i < N; i++) {
			v = (N+1)/2.0;
			if ((i&1) != 0) {
				A += v;
			} else {
				B += v;
			}
			N >>= 1;
		}
		
		System.out.println((int)Math.round(A) + " " + (int)Math.round(B));
		br.close();
	}
}
