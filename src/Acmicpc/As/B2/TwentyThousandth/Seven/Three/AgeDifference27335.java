package Acmicpc.As.B2.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AgeDifference27335 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		StringBuilder sb = new StringBuilder();
		int m = Integer.MIN_VALUE, n = Integer.MAX_VALUE, v = 0;
		
		for (int i = 0; i < str.split(" ").length; i++) {
			v = Integer.parseInt(str.split(" ")[i]);
			m = Math.max(v, m);
			n = Math.min(v, n);
		}
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			sb.append(Math.max(Math.abs(v-m), Math.abs(v-n))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
