package Acmicpc.As.B2.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TuringEquation6565 {
	static final int t = 3;
	static String[] strs = null;
	static StringBuilder[] sBuilders = null;
	static boolean valid() {
		boolean valid = false;
		for (int i = 0; i < strs.length; i++) {
			if (!strs[i].equals("0")) {
				valid = true;
			}
		}
		return valid;
	}
	static boolean check() {
		int a = Integer.parseInt(sBuilders[0].reverse().toString());
		int b = Integer.parseInt(sBuilders[1].reverse().toString());
		int c = Integer.parseInt(sBuilders[2].reverse().toString());
		
		return a + b == c;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), "+|=");
			strs = new String[t];
			
			for (int i = 0; i < strs.length; i++) {
				strs[i] = st.nextToken();
			}
			
			sBuilders = new StringBuilder[t];
			for (int i = 0; i < sBuilders.length; i++) {
				sBuilders[i] = new StringBuilder(strs[i]);
			}
			sb.append(check() ? "True" : "False").append("\n");
			
			if (!valid()) break;
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
