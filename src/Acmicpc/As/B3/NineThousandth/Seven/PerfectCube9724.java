package Acmicpc.As.B3.NineThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectCube9724 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0, cnt = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			cnt = 0;
			for(int j = (int)Math.pow(A, 0.33333333); j <= (int)Math.pow(B, 0.33333333); j++) {
				if (A <= Math.pow(j, 3) && Math.pow(j, 3) <= B) cnt++;
			}
			sb.append("Case #" + i + ": " + cnt + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
