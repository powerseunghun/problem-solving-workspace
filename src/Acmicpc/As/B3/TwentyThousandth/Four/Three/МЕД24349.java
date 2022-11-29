package Acmicpc.As.B3.TwentyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class МЕД24349 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0])-1;
		int a = Integer.parseInt(tmp.split(" ")[1]);
		int b = Integer.parseInt(tmp.split(" ")[2]);
		int c = Integer.parseInt(tmp.split(" ")[3]);
		int cur = 0, res = 0;
		
		while (n-- > 0) {
			switch(cur) {
			case 0:
				if (a >= b) {
					res += b;
					cur = 2;
				}
				else {
					res += a;
					cur = 1;
				}
				break;
			case 1:
				if (a >= c) {
					res += c;
					cur = 2;
				}
				else {
					res += a;
					cur = 0;
				}
				break;
			case 2:
				if (b >= c) {
					res += c;
					cur = 1;
				}
				else {
					res += b;
					cur = 0;
				}
				break;
			}
		}
		
		System.out.println(res/100 + " " + res%100);
		br.close();
	}
}
