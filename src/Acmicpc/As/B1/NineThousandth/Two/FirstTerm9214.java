package Acmicpc.As.B1.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstTerm9214 {
	static String func(String str, String before) {
		StringBuilder sb = new StringBuilder();
		if (str.equals(before)) return "same";
		for (int i = 0; i < str.length(); i+=2) {
			String subStr = str.substring(i, i+2);
			for (int j = 0; j < subStr.charAt(0)-'0'; j++) {
				sb.append(subStr.charAt(1));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = 1;
		String str = null, before = null, tStr = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("0")) break;
			
			before = "";
			while (str.length() % 2 == 0) {
				tStr = str;
				str = func(str, before);
				before = tStr;
				if (str.equals("same")) {
					str = before;
					break;
				}
			}
			sb.append("Test " + (t++) + ": ").append(str).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
