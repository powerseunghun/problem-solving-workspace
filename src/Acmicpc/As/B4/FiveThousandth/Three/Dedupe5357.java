package Acmicpc.As.B4.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dedupe5357 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(str.charAt(0));
			for (int i = 1; i < str.length(); i++) {
				if (str.charAt(i-1) != str.charAt(i)) {
					sb.append(str.charAt(i));
				}
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
