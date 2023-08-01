package Acmicpc.As.B2.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LeafYear18403 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), v = 0;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine(), ", ");
			while(st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				if (v % 4 == 0) {
					sb.append(v).append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
