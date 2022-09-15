package Acmicpc.As.B3.TwoThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryNumbers20360 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String res = null;
		
		while (N != 0) {
			sb.append(N%2);
			N/=2;
		}
		res = sb.toString();
		sb = new StringBuilder();
		
		for (int i = 0; i < res.length(); i++) {
			if (res.charAt(i) == '1') {
				sb.append(i + " ");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
