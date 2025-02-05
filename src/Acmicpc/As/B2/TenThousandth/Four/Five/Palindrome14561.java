package Acmicpc.As.B2.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome14561 {
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null, res = null;
		long A = 0, n = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			A = Long.parseLong(str.split(" ")[0]);
			n = Long.parseLong(str.split(" ")[1]);
			res = "";
			while(A != 0) {
				if (A%n < 10) {
					res += A%n;
				} else {
					res += A%n-10;
				}
 				A /= n;
			}
			sb.append(check(res) ? "1" : "0").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
