package Acmicpc.As.B4.ThirtyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChampernowneVerification31520 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), res = String.valueOf(str.length());
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i)-'0' != i+1) {
				res = "-1";
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
