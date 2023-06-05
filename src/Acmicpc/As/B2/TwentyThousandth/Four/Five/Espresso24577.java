package Acmicpc.As.B2.TwentyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Espresso24577 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int s = Integer.parseInt(str.split(" ")[1]), cur = s, x = 0, res = 0;
		
		while(n-- > 0) {
			str = br.readLine();
			x = str.contains("L") ? (str.charAt(0) - '0') + 1 : Integer.parseInt(str);
			if (cur < x) {
				res++;
				cur = s;
			}
			cur -= x;
		}
		
		System.out.println(res);
		br.close();
	}
}
