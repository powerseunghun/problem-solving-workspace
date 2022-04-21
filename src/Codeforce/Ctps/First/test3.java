package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test3 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, idx1 = 0, idx2 = 0;
		StringTokenizer st = null;
		// true = even, false = odd
		
		for (int i = 0, c = 0; i < t; i++) {
			n = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			c = 0;
			for (int j = 0, val = 0; j < n; j++) {
				val = Integer.parseInt(st.nextToken());
				if (j == 0) {
					idx1 = val;
					continue;
				}
				else if (j == 1) {
					idx2 = val;
					continue;
				}
				if (j % 2 == 0 && (idx1 % 2 != val % 2)) {
					sb.append("NO\n");
					c = 1;
					break;
				}
				else if (j % 2 != 0 && (idx2 % 2 != val % 2)){
					sb.append("NO\n");
					c = 1;
					break;
				}
			}
			if (c == 0) sb.append("YES\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
