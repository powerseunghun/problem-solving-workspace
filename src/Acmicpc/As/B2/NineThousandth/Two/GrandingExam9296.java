package Acmicpc.As.B2.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GrandingExam9296 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), c = 1, cnt = 0;
		String str1 = null, str2 = null;
		
		while(T-- > 0) {
			br.readLine();
			cnt = 0;
			str1 = br.readLine();
			str2 = br.readLine();
			
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) cnt++;
			}
			
			sb.append("Case " + (c++) + ": " + cnt).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
