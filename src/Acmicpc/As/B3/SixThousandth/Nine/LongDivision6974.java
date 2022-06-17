package Acmicpc.As.B3.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class LongDivision6974 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger A = null, B = null;
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			A = new BigInteger(br.readLine());
			B = new BigInteger(br.readLine());
			sb.append(A.divide(B) + "\n");
			sb.append(A.mod(B) + "\n");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
