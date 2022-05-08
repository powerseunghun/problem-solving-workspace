package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortSubstrings {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		String tmp = null;
		
		for (int i = 0; i < t; i++) {
			tmp = br.readLine();
			sb.append(tmp.substring(0, 2));
			for (int j = 3; j < tmp.length(); j+=2) {
				sb.append(tmp.charAt(j));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
