package Acmicpc.As.B4.TwentyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleProblem25494 {
	static int func(int a, int b, int c) {
		int cnt = 0;
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				for (int k = 1; k <= c; k++) {
					if ((i % j == j % k) && (j % k == k % i)) cnt++;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			sb.append(func(a, b, c) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
