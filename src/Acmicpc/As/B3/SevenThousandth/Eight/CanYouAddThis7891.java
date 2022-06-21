package Acmicpc.As.B3.SevenThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class CanYouAddThis7891 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		BigInteger A = null, B = null;
		String tmp = null;
		
		while (t-- > 0) {
			tmp = br.readLine();
			A = new BigInteger(tmp.split(" ")[0]);
			B = new BigInteger(tmp.split(" ")[1]);
			sb.append(A.add(B) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
