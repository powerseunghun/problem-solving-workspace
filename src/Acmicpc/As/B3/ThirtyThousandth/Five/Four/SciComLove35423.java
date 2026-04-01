package Acmicpc.As.B3.ThirtyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SciComLove35423 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int x = 0, y = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'S') {
				x++;
			} else if (str.charAt(i) == 'L') {
				y++;
			}
		}
		
		for (int i = 0; i < x; i++) {
			sb.append("SciCom");
		}
		for (int i = 0; i < y; i++) {
			sb.append("Love");
		}
		System.out.println(sb.toString());
		br.close();
	}
}
