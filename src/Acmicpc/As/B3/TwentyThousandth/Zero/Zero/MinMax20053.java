package Acmicpc.As.B3.TwentyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MinMax20053 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), max = 0, min = 0, val = 0;
		StringTokenizer st = null;
		
		while (T-- > 0) {
			br.readLine();
			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				max = Math.max(val, max);
				min = Math.min(val, min);
			}
			sb.append(min + " " + max + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
