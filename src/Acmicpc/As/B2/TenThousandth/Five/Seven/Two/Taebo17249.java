package Acmicpc.As.B2.TenThousandth.Five.Seven.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Taebo17249 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), l = null, r = null;
		int res1 = 0, res2 = 0, idx = str.indexOf('(');
		
		l = str.substring(0, idx);
		r = str.substring(idx+5, str.length());
		
		res1 = l.length() - l.replaceAll("@", "").length();
		res2 = r.length() - r.replaceAll("@", "").length();
		
		System.out.println(res1 + " " + res2);
		br.close();
	}
}
