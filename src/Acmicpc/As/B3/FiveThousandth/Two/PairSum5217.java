package Acmicpc.As.B3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PairSum5217 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, cnt = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			cnt = 0;
			sb.append("Pairse for " + n + ": ");
			for (int i = 1; i <= n; i++) {
				for (int j = i+1; j <= n; j++) {
					if (i+j == n) {
						if (cnt == 0) {
							sb.append(i + " " + j);
							cnt++;
						}
						else sb.append(", " + i + " " + j);
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
