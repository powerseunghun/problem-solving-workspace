package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gradabase9286 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0, a = 0;
		
		for (int i = 1; i <= T; i++) {
			sb.append("Case " + i + ":\n");
			n = Integer.parseInt(br.readLine());
			for (int j = 0; j < n; j++) {
				a = Integer.parseInt(br.readLine());
				sb.append(a == 6 ? "" : (a+1) + "\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
