package Acmicpc.As.B3.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalancingWeights11131 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), sum = 0;
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		
		while (T-- > 0) {
			br.readLine();
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum += Integer.parseInt(st.nextToken());
			}
			if (sum < 0) sb.append("Left\n");
			else if (sum > 0) sb.append("Right\n");
			else sb.append("Equilibrium\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
