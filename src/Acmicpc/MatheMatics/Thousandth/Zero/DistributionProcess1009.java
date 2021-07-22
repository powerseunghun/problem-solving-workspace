package Acmicpc.MatheMatics.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistributionProcess1009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 1, a = 0, b = 0;
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			N = 1;
			for (int j = 1; j <= b; j++) {
				N = (N * a) % 10;
			}
			if (N == 0) {
				sb.append("10\n");
				continue;
			}
			sb.append(N + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
