package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HidethoseLetters9949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, t = null;
		int n = 0, v = 1;
		
		while(true) {
			str = br.readLine();
			if (str.contains("#")) break;
			
			n = Integer.parseInt(br.readLine());
			sb.append("Case ").append((v++)).append("\n");
			for (int i = 0; i < n; i++) {
				t = br.readLine();
				for (int j = 0; j < str.split(" ").length; j++) {
					t = t.replaceAll(str.split(" ")[j], "_");
					t = t.replaceAll(String.valueOf((char)(str.split(" ")[j].charAt(0)-32)), "_");
				}
				sb.append(t).append("\n");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
