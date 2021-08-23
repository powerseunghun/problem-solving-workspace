package Acmicpc.NumberTheory.SixThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrunkenSangBum6359 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, count = 0;
		boolean[] room = null;
		
		for (int i = 0; i < T; i++) {
			count = 0;
			n = Integer.parseInt(br.readLine());
			room = new boolean[n+1];
			for (int j = 1; j <= n; j++) {
				for (int k = j; k <= n; k += j) {
					room[k] = room[k] == true ? false : true;
				}
			}
			for (boolean b : room) {
				if (b) count++;
			}
			sb.append(count + "\n");
		}
		System.out.print(sb.toString());
	}
}
