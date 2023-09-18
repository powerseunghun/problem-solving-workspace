package Acmicpc.As.B1.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DigitalTV2816 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), c1 = 0, c2 = 0, t = 0;
		String str = null;
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (str.equals("KBS1")) {
				c1 = i;
			}
			else if (str.equals("KBS2")) {
				c2 = i;
			}
		}
		t = c1 > c2 ? 1 : 0;
		
		for (int i = 0; i < c1; i++) {
			sb.append("1");
		}
		for (int i = 0; i < c2; i++) {
			sb.append("4");
		}
		for (int i = 0; i < c2+t; i++) {
			sb.append("1");
		}
		for (int i = 0; i < c2+t-1; i++) {
			sb.append("4");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
