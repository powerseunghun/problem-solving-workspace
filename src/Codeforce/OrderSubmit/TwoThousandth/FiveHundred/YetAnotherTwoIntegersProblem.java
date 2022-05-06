package Codeforce.OrderSubmit.TwoThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class YetAnotherTwoIntegersProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), a = 0, b = 0, diff = 0;
		String tmp = null;
		
		while (t-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			diff = Math.abs(a-b);
			sb.append(diff % 10 == 0 ? diff / 10 : diff / 10 + 1);
			
			if (t != 0) sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
