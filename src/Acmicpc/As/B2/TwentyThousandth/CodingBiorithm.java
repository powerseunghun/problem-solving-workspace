package Acmicpc.As.B2.TwentyThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingBiorithm {
	static int func(String str, int s, int l) {
		int res = 0;
		for (int i = s; i < s+l; i++) {
			res += (int) Math.pow(str.charAt(i)-bStr.charAt(i), 2);
		}
		return res;
	}
	static String bStr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bStr = br.readLine();
		int T = Integer.parseInt(br.readLine()), v = 0, max = Integer.MIN_VALUE;
		String str = null, res = "99999999";
		
		while(T-- > 0) {
			str = br.readLine();
			v = func(str, 0, 4) * func(str, 4, 2) * func(str, 6, 2);
			if (v >= max) {
				if (v == max) {
					if (Integer.parseInt(res) > Integer.parseInt(str)) {
						max = v;
						res = str;
					}
				}
				else {
					max = v;
					res = str;
				}
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
