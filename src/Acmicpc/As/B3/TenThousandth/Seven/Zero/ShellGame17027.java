package Acmicpc.As.B3.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShellGame17027 {
	static String[] strs = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), a = 0, b = 0, c = 0, cur = 0, res = 0;
		strs = new String[T];
		
		for (int i = 0; i < T; i++) {
			strs[i] = br.readLine();
		}
		
		for (int i = 1, sc = 0; i <= T; i++) {
			cur = i;
			sc = 0;
			for (int j = 0; j < strs.length; j++) {
				a = Integer.parseInt(strs[j].split(" ")[0]);
				b = Integer.parseInt(strs[j].split(" ")[1]);
				c = Integer.parseInt(strs[j].split(" ")[2]);
				if (a == cur || b == cur) {
					cur = a == cur ? b : a;
				}
				sc += cur == c ? 1 : 0;
			}
			res = Math.max(res, sc);
		}
		
		System.out.println(res);
		br.close();
	}
}
