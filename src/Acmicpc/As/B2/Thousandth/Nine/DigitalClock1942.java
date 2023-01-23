package Acmicpc.As.B2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitalClock1942 {
	static final int T = 3;
	static int func(String str) {
		String[] strs = str.split(":");
		int res = 0;
		for (int i = strs.length-1, w = 0; i >= 0; i--) {
			res += Integer.parseInt(strs[i]) * Math.pow(60, w++);
		}
		return res;
	}
	static boolean check(int A) {
		int res = 0;
		for (int i = 0, w = 2; i < 3; i++) {
			res += (A % 60) * Math.pow(100, w--);
			A /= 60;
		}
		return res % 3 == 0 ? true : false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int res = 0;
		
		for (int i = 0, A = 0, B = 0; i < T; i++) {
			tmp = br.readLine();
			A = func(tmp.split(" ")[0]);
			B = func(tmp.split(" ")[1]);
			
			res = 0;
			while(true) {
				if (check(A)) res++;
				if (A == B) break;
				A++;
				A %= (3600 * 24);
			}
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
