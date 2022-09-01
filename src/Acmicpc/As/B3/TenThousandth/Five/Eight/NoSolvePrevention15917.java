package Acmicpc.As.B3.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class NoSolvePrevention15917 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine()), a = 0;
		
		while (Q-- > 0) {
			a = Integer.parseInt(br.readLine());
			sb.append((a & (-1 * a))==a ? 1 : 0);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
