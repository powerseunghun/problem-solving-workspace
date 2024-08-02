package Acmicpc.As.B4.TwentyThousandth.Nine.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Отряд29340 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
			sb.append(Math.max(str1.charAt(i)-'0', str2.charAt(i)-'0'));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
