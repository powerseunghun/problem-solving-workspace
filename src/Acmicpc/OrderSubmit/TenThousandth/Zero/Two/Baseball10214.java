package Acmicpc.OrderSubmit.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baseball10214 {
	static final int inning = 9;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), y = 0, k = 0;
		String tmp = null;
		
		for (int i = 0; i < T; i++) {
			y = 0;
			k = 0;
			for (int j = 0; j < inning; j++) {
				tmp = br.readLine();
				y += Integer.parseInt(tmp.split(" ")[0]);
				k += Integer.parseInt(tmp.split(" ")[1]);
			}
			if (y == k) sb.append("DRAW");
			else sb.append(y > k ? "Yonsei" : "Korea");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
