package Acmicpc.As.B2.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindromes13774 {
	static boolean isPalidrome(String str) {
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			
			boolean flag = false;
			for (int i = 0; !flag && i < str.length(); i++) {
				String v = str.substring(0, i) + str.substring(i+1);
				if (isPalidrome(v)) {
					sb.append(v).append("\n");
					flag = true;
				}
			}
			if (!flag) {
				sb.append("not possible").append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
