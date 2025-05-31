package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BeautifulMusic15181 {
	static final int w = 7;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while(true) {
			str = br.readLine();
			if (str.equals("#")) break;
			boolean flag = true;
			for (int i = 1, d = 0; i < str.length() && flag; i++) {
				d = (str.charAt(i)-str.charAt(i-1)+w)%w;
				if (d != 2 && d != 4 && d != 6) {
					sb.append("Ouch! That hurts my ears.");
					flag = false;
					break;
				}
			}
			if (flag) {
				sb.append("That music is beautiful.");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
