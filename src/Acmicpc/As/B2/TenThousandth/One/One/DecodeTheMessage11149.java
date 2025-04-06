package Acmicpc.As.B2.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DecodeTheMessage11149 {
	static final int l = 26;
	static int func(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += (str.charAt(i)-97);
		}
		return sum%(l+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				int f = func(st.nextToken());
				sb.append(f == l ? ' ' : (char)(f+'a'));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
