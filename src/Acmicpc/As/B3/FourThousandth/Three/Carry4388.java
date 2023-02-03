package Acmicpc.As.B3.FourThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Carry4388 {
	static int calc(String str1, String str2) {
		int res = 0, carry = 0;
		for (int i = str1.length()-1, val = 0; i >= 0; i--) {
			val = (str1.charAt(i)-'0' + str2.charAt(i)-'0') + carry;
			carry = val / 10;
			if (carry != 0) res++;
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, str1 = null, str2 = null;
		int A = 0, B = 0;
		
		while(true) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			str1 = String.format("%010d", A);
			str2 = String.format("%010d", B);
			if (A == 0 && B == 0) break;
			
			sb.append(calc(str1, str2) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
