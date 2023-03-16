package Acmicpc.As.B2.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Decoder5365 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		String tmp = null;
		int len = 0;
		
		while (st.hasMoreTokens()) {
			tmp = st.nextToken();
			if (len == 0) {
				sb.append(tmp.charAt(0));
				len = tmp.length();
				continue;
			}
			sb.append(tmp.length() < len ? ' ' : tmp.charAt(len-1));
			len = tmp.length();
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
