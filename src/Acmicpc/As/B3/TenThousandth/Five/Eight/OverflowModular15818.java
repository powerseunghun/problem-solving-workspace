package Acmicpc.As.B3.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OverflowModular15818 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(tmp.split(" ")[1]);
		long sum = 1;
		while (st.hasMoreTokens()) {
			sum = ((sum % M) * (Long.parseLong(st.nextToken()) % M) % M);
		}
		
		System.out.println(sum);
		br.close();
	}
}
