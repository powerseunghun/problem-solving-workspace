package Acmicpc.As.B2.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Yabawe15814 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(br.readLine());
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0;
		String str = null;
		char c = ' ';
		
		while(T-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = sb.charAt(a);
			sb.setCharAt(a, sb.charAt(b));
			sb.setCharAt(b, c);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
