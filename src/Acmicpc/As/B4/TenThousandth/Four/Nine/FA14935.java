package Acmicpc.As.B4.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FA14935 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), before = null;
		int cnt = 0, lp = str.length();
		boolean flag = false;
		
		while (cnt++ <= lp*2) {
			before = str.toString();
			str = ((str.charAt(0)-'0') * str.length()) + "";
			if (before.equals(str)) {
				flag = true;
				break;
			}
		}
		if (flag) System.out.println("FA");
		else System.out.println("NFA");
		
		br.close();
	}
}
