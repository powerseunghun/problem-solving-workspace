package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SkewBinary4678 {
	static int func(String tmp) {
		int res = 0, w = 1;
		for (int i = tmp.length()-1; i >= 0; i--) {
			res += ((tmp.charAt(i)-'0') * (Math.pow(2, w++)-1));
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("0")) break;
			sb.append(func(tmp)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
