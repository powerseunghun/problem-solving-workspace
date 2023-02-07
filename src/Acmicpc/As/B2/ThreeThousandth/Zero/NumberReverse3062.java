package Acmicpc.As.B2.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberReverse3062 {
	static int getSum(int N) {
		StringBuilder sb = new StringBuilder(N+"");
		return Integer.parseInt(sb.reverse().toString()) + N;
	}
	static boolean check(int N) {
		String str = N+"";
		for (int i = 0, e = str.length()-1; i < e; i++, e--) {
			if (str.charAt(i) != str.charAt(e)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(check(getSum(N)) ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
