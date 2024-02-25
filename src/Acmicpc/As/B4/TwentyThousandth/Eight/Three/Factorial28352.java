package Acmicpc.As.B4.TwentyThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Factorial28352 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigInteger res = new BigInteger("6");
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 11; i <= N; i++) {
			res = res.multiply(new BigInteger(String.valueOf(i)));
		}
		
		System.out.println(res);
		br.close();
	}
}
