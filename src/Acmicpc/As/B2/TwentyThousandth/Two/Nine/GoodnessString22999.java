package Acmicpc.As.B2.TwentyThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodnessString22999 {
	static int get(String str) {
		int sum = 0;
		for (int i = 0, e = str.length()-1; i < str.length()/2; i++,e--) {
			sum += str.charAt(i) != str.charAt(e) ? 1 : 0;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, K = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			K = Integer.parseInt(tmp.split(" ")[1]);
			tmp = br.readLine();
			sb.append("Case #" + i + ": " + Math.abs(K-get(tmp)) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
