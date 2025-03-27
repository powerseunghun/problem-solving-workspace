package Acmicpc.As.B2.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOR17285 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			sb.append((char)(str.charAt(i)^(str.charAt(0)^'C')));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
