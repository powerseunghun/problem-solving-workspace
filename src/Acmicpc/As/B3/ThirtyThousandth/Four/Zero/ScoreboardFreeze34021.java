package Acmicpc.As.B3.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ScoreboardFreeze34021 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0, L = 0, res = 0;
		String str = null;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			M = Integer.parseInt(str.split(" ")[1]);
			L = Integer.parseInt(str.split(" ")[2]);
			arr = new int[N];
			res = L;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == -1) continue;
				res = Math.max(res, M-arr[i]);
			}
			sb.append("The scoreboard has been frozen with ").append(res).append(" minute").append(res > 1 ? "s" : "").append(" remaining.").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
