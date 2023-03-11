package Acmicpc.As.B2.FourThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScoreTotalizer4974 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, max = 0, min = 0, sum = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			max = Integer.MIN_VALUE;
			min = Integer.MAX_VALUE;
			sum = 0;
			for (int i = 0, v = 0; i < N; i++) {
				v = Integer.parseInt(br.readLine());
				sum += v;
				max = Math.max(max, v);
				min = Math.min(min, v);
			}
			sb.append((sum-max-min) / (N-2)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
