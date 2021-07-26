package Acmicpc.String.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordReverse9093 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				for (int j = tmp.length()-1; j >= 0; j--) {
					sb.append(tmp.charAt(j));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
