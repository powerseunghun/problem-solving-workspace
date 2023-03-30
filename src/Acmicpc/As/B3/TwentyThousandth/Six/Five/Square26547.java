package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Square26547 {
	static char[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			arr = new char[str.length()][str.length()];
			
			for (int i = 0; i < str.length(); i++) {
				arr[0][i] = str.charAt(i);
			}
			for (int i = 0; i < str.length(); i++) {
				arr[i][0] = str.charAt(i);
			}
			for (int i = str.length()-1, idx = 0; i >= 0; i--) {
				arr[str.length()-1][i] = str.charAt(idx++);
			}
			for (int i = str.length()-1, idx = 0; i >= 0; i--) {
				arr[i][str.length()-1] = str.charAt(idx++);
			}
			
			for (char[] cs : arr) {
				for (char c : cs) {
					sb.append(c == '\u0000' ? ' ' : c);
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
