package Acmicpc.As.B3.TwentyThousandth.Three.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Retype23925 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0, K = 0, S = 0, res = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Long.parseLong(tmp.split(" ")[0]);
			K = Long.parseLong(tmp.split(" ")[1]);
			S = Long.parseLong(tmp.split(" ")[2]);
			res = Math.min((K-1 + (K-S) + (N-S+1)), 1+N+K-1);
			
			sb.append("Case #" + i + ": " + res + "\n");
 		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
