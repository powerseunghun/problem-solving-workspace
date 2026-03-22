package Acmicpc.As.B2.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModeratePace20341 {
	static int[] k = null, a = null, b = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		String str = null;
		k = new int[n];
		a = new int[n];
		b = new int[n];
		
		for (int i = 0; i < 3; i++) {
			str = br.readLine();
			for (int j = 0; j < str.split(" ").length; j++) {
				if (i == 0) {
					k[j] = Integer.parseInt(str.split(" ")[j]);
				} else if(i == 1) {
					a[j] = Integer.parseInt(str.split(" ")[j]);
				} else {
					b[j] = Integer.parseInt(str.split(" ")[j]);
				}
			}
		}
		for (int i = 0; i < n; i++) {
			sb.append((k[i]+a[i]+b[i]) - Math.max(k[i], Math.max(a[i], b[i])) - Math.min(k[i], Math.min(a[i], b[i]))).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
