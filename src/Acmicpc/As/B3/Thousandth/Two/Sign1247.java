package Acmicpc.As.B3.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Sign1247 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		BigInteger res = null;
		int tc = 3, N = 0;
		
		while (tc-- > 0) {
			N = Integer.parseInt(br.readLine());
			res = new BigInteger("0");
			for (int i = 0; i < N; i++) {
				res = res.add(new BigInteger(br.readLine()));
			}
			switch(res.compareTo(BigInteger.ZERO)) {
			case 0:
				sb.append("0\n");
				break;
			case 1:
				sb.append("+\n");
				break;
			case -1:
				sb.append("-\n");
				break;
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
