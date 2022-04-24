package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DivisibilityProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		long a = 0, b = 0;
		String tmp = null;
		
		while (t-- > 0) {
			tmp = br.readLine();
			a = Long.parseLong(tmp.split(" ")[0]);
			b = Long.parseLong(tmp.split(" ")[1]);
			if (a % b == 0) {
				sb.append("0\n");
				continue;
			}
			sb.append((((a/b) + 1) * b - a) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
