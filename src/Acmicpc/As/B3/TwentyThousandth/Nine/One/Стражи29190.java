package Acmicpc.As.B3.TwentyThousandth.Nine.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Стражи29190 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int m = Integer.parseInt(str.split(" ")[1]);
		str = br.readLine();
		int x = Integer.parseInt(str.split(" ")[0]);
		int y = Integer.parseInt(str.split(" ")[1]);
		int k = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1, a = 0, b = 0; j <= m; j++) {
				a = Math.abs(i-x);
				b = Math.abs(j-y);
				res = a+b > 0 && a+b <= k ? res+1 : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
