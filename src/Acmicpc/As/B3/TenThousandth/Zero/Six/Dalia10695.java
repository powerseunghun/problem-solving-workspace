package Acmicpc.As.B3.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dalia10695 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), r1 = 0, c1 = 0, r2 = 0, c2 = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			sb.append("Case " + i + ": ");
			tmp = br.readLine();
			r1 = Integer.parseInt(tmp.split(" ")[1]);
			c1 = Integer.parseInt(tmp.split(" ")[2]);
			r2 = Integer.parseInt(tmp.split(" ")[3]);
			c2 = Integer.parseInt(tmp.split(" ")[4]);
			
			
			if (Math.abs(r1-r2) == 1 && Math.abs(c1-c2) == 2) {
				sb.append("YES\n");
				continue;
			}
			else if (Math.abs(r1-r2) == 2 && Math.abs(c1-c2) == 1) {
				sb.append("YES\n");
				continue;
			}
			sb.append("NO\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
