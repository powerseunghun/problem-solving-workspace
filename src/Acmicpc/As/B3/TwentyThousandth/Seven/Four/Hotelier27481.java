package Acmicpc.As.B3.TwentyThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hotelier27481 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		StringBuilder sb = new StringBuilder("0000000000");
		char c = ' ';
		
		for (int i = 0, idx = 0, flag = 0; i < str.length(); i++, flag = 0) {
			c = str.charAt(i);
			switch(c) {
			case 'L': case 'R':
				idx = c == 'L' ? sb.toString().indexOf('0') : sb.toString().lastIndexOf('0');
				sb.setCharAt(idx, '1');
				break;
			default:
				idx = c-'0';
				flag = 1;
				break;
			}
			sb.setCharAt(idx, flag == 0 ? '1' : '0');
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
