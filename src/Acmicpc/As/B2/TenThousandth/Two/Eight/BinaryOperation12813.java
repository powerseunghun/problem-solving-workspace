package Acmicpc.As.B2.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryOperation12813 {
	static final int o = 5;
	static String func(String a, String b, int op) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, c1 = 0, c2 = 0; i < Math.min(a.length(), b.length()); i++) {
			c1 = a.charAt(i) - '0';
			c2 = b.charAt(i) - '0';
			switch(op) {
			case 1:
				sb.append(c1 & c2);
				break;
			case 2:
				sb.append(c1 | c2);
				break;
			case 3:
				sb.append(c1 ^ c2);
				break;
			case 4:
				sb.append(c1^1);
				break;
			case 5:
				sb.append(c2^1);
				break;
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String b = br.readLine();
		
		for (int i = 1; i <= o; i++) {
			sb.append(func(a, b, i)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
