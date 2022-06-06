package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JBox5354 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == 0 || i == (n-1)) {
						sb.append("#");
					}
					else {
						if (j == 0 || j == (n-1)) sb.append("#");
						else sb.append("J");
					}
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
