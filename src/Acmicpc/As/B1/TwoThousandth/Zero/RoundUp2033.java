package Acmicpc.As.B1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoundUp2033 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double N = Double.parseDouble(br.readLine()), w = 10.0;
//		System.out.println(Math.round(14.0 / 10) * 10.0);
		
		while(N > w) {
			N = Math.round(N / w) * w;
			w *= 10;
		}
		
		System.out.println((int)N);
		br.close();
	}
}
