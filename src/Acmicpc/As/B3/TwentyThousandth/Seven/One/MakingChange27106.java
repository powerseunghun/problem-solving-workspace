package Acmicpc.As.B3.TwentyThousandth.Seven.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakingChange27106 {
	static int[] cost = {25, 10, 5, 1};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int P = 100-Integer.parseInt(br.readLine()), chg = 0;
		
		for (int i = 0; i < cost.length; i++) {
			if (P < cost[i]) {
				sb.append(0 + " ");
				continue;
			}
			chg = P/cost[i];
			P -= chg*cost[i];
			sb.append(chg + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
