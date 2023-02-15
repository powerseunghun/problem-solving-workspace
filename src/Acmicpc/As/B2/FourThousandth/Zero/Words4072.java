package Acmicpc.As.B2.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Words4072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			tmp = st.nextToken();
			if (tmp.equals("#")) break;
			
			for (int i = tmp.length()-1; i >= 0; i--) {
				sb.append(tmp.charAt(i));
			}
			sb.append(" ");
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				for (int i = tmp.length()-1; i >= 0; i--) {
					sb.append(tmp.charAt(i));
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
