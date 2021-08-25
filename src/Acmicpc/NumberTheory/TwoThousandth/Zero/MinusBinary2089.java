package Acmicpc.NumberTheory.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinusBinary2089 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		if (N == 0) {
			System.out.println("0");
			return;
		}
		
		while (N != 0) {
			if (N % -2 == 0) {
				sb.append("0");
				N /= -2;
			}
			else {
				sb.append("1");
				N = (N -1) / -2;
			}
		}
		
		System.out.println(sb.reverse().toString());
	}
}
