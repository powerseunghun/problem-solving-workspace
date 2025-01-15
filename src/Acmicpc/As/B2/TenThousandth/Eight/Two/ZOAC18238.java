package Acmicpc.As.B2.TenThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ZOAC18238 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "A" + br.readLine();
		int res = 0;
		
		for (int i = 1, v = 0; i < str.length(); i++) {
			v = Math.abs(str.charAt(i)-str.charAt(i-1));
			res += Math.min(v, 26-v);
		}
		
		System.out.println(res);
		br.close();
	}
}
