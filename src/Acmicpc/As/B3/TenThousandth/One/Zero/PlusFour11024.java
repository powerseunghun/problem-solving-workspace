package Acmicpc.As.B3.TenThousandth.One.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PlusFour11024 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), sum = 0;
		StringTokenizer st = null;
		
		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
