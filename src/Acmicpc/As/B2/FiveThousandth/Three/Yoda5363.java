package Acmicpc.As.B2.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Yoda5363 {
	static String[] tArr = new String[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < tArr.length; i++) {
				tArr[i] = st.nextToken();
			}
			while (st.hasMoreTokens()) {
				sb.append(st.nextToken()).append(" ");
			}
			for (int i = 0; i < tArr.length; i++) {
				sb.append(tArr[i]);
				if (i == tArr.length-1) sb.append("\n");
				else sb.append(" ");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
