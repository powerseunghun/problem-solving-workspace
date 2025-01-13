package Acmicpc.As.B2.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CreditCardJudgement14726 {
	static int getDigit(int v) {
		int res = 0;
		while(v != 0) {
			res += v%10;
			v/=10;
		}
		return res;
	}
	static Boolean func(String str) {
		int res = 0;
		for (int i = str.length()-1, idx = 1; i >= 0; i--, idx--) {
			if (idx%2 == 0) {
				int v = (str.charAt(i)-'0') * 2;
				if (v >= 10) {
					res += getDigit(v);
				} else {
					res += v;
				}
				
			} else {
				res += str.charAt(i)-'0';
			}
		}
		return res%10 == 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(func(str) ? "T" : "F").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
