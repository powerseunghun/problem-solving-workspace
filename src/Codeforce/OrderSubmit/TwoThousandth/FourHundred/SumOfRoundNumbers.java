package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumOfRoundNumbers {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), count = 0;
		String str = null;
		
		for (int i = 0; i < t; i++) {
			str = br.readLine();
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) != '0') count++;
			}
			sb.append(count + "\n");
			for (int j = 0, idx = str.length()-1; j < str.length(); j++, idx--) {
				if (str.charAt(j) != '0') {
					int res = (int)(Math.pow(10, idx) * (str.charAt(j) -'0'));
					sb.append(res + " ");
				}
			}
			if (i != t-1)sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
