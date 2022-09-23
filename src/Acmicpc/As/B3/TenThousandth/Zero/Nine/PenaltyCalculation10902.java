package Acmicpc.As.B3.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PenaltyCalculation10902 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), t = 0, s = 0, f = 0, maxS = Integer.MIN_VALUE, maxT = 0, res = 0;
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			t = Integer.parseInt(tmp.split(" ")[0]);
			s = Integer.parseInt(tmp.split(" ")[1]);
			if (s > maxS) {
				maxS = s;
				maxT = t;
				f = i+1;
			}
		}
		
		res = maxS == 0 ? 0 : maxT+(f-1)*20;
		System.out.println(res);
		br.close();
	}
}
