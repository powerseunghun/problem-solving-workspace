package Acmicpc.As.B3.SixThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalRoot6378 {
	static String func(String str) {
		int sum = 0;
		while (str.length() != 1) {
			sum = 0;
			for (int i = 0; i < str.length(); i++) {
				sum += str.charAt(i) - '0';
			}
			str = sum+"";
		}
		return str;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			if (tmp.equals("0")) break;
			
			sb.append(func(tmp) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
