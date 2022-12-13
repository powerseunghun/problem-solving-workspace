package Acmicpc.As.B4.TwentyThousandth.Six.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GoodCoinDenomination26350 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), b = 0, c = 0;
		boolean flag = true;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			st.nextToken();
			flag = true;
			b = Integer.parseInt(st.nextToken());
			sb.append("Denominations: " + b + " ");
			while (st.hasMoreTokens()) {
				c = Integer.parseInt(st.nextToken());
				sb.append(c + " ");
				if (!(c >= b*2)) flag = false;
				b = c;
			}
			sb.append("\n" + (flag ? "Good " : "Bad ") + "coin denominations!\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
