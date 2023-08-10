package Acmicpc.As.B1.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BugKing3447 {
	public static void main(String[] args) throws IOException {
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while ((str = br.readLine()) != null) {
			if (str.equals("ASD"))break;
			while (str.contains("BUG")) {
				str = str.replace("BUG", "");
			}
			sb.append(str).append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
