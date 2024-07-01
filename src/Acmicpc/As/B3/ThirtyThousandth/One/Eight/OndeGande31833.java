package Acmicpc.As.B3.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class OndeGande31833 {
	static final int l = 2;
	static BigInteger[] bis = new BigInteger[l];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = null;
		br.readLine();
		
		for (int i = 0; i < l; i++) {
			sb = new StringBuilder();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sb.append(st.nextToken());
			}
			bis[i] = new BigInteger(sb.toString());
		}
		
		System.out.println(bis[0].compareTo(bis[1]) > 0 ? bis[1] : bis[0]);
		br.close();
	}
}
