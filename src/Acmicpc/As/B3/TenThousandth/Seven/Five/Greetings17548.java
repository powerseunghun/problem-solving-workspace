package Acmicpc.As.B3.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greetings17548 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			if (str.charAt(i) == 'e') sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
