package Acmicpc.As.B3.TenThousandth.Zero.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AhmedAly10698 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), X = 0, Y = 0, Z = 0;
		char O = ' ';
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			sb.append("Case " + i + ": ");
			tmp = br.readLine();
			X = Integer.parseInt(tmp.split(" ")[0]);
			O = tmp.split(" ")[1].charAt(0);
			Y = Integer.parseInt(tmp.split(" ")[2]);
			Z = Integer.parseInt(tmp.split(" ")[4]);
			switch(O) {
			case '+':
				if ((X+Y) == Z) sb.append("YES\n");
				else sb.append("NO\n");
				break;
			case '-':
				if ((X-Y) == Z) sb.append("YES\n");
				else sb.append("NO\n");
				break;
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
