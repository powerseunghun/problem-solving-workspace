package Acmicpc.As.B3.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhichNumberKindIsIt32682 {
	static String func(int N) {
		double r = Math.sqrt(N);
		String res = "";
		if (N%2 != 0) res += "O";
		if (r == (int)r) res += "S";
		
		return res.isEmpty() ? "EMPTY" : res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(func(N)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
