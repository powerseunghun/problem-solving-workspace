package Acmicpc.As.B2.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheLostCow14530 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int res = 0, cur = x, t = 1, d = 1;
		boolean flag = true;
		
		while(flag) {
			while(flag) {
				if (cur == y) {
					flag = false;
					break;
				}
				if (cur == x + d * t) break;
				res++;
				cur += d;
			}
			t *= 2;
			d *= -1;
		}
		
		System.out.println(res);
		br.close();
	}
}
