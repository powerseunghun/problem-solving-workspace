package Acmicpc.As.B2.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SelfReplicationNumber2028 {
	static boolean check(int N, int l) {
		StringBuilder sb = new StringBuilder();
		String str = (int)(Math.pow(N, 2)) + "";
		for (int i = 0, w = str.length()-1; i < l; i++) {
			sb.append(str.charAt(w--));
		}
		int val = Integer.parseInt(sb.reverse().toString());
		return val == N;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(check(N, (N+"").length()) ? "YES\n" : "NO\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
