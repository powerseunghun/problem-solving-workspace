package Acmicpc.As.B3.TenThousandth.Six.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Farm16283 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int n = Integer.parseInt(tmp.split(" ")[2]);
		int w = Integer.parseInt(tmp.split(" ")[3]);
		int res1 = 0, res2 = 0, cnt = 0;
		
		for (int i = 1; i < n; i++) {
			if (a*i + b*(n-i) == w) {
				cnt++;
				res1 = i;
				res2 = (n-i);
			}
		}
		
		System.out.println((cnt == 0 || cnt > 1) ? "-1" : res1 + " " + res2);
		br.close();
	}
}
