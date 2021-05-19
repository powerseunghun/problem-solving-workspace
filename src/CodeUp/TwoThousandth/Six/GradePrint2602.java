package CodeUp.TwoThousandth.Six;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class GradePrint2602 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		int sum = 0, idx = 0;
		int[] tSum = new int[4];
		Arrays.fill(tSum, 0);
		
		for (int i = 0; i < 3; i++) {
			tmp = br.readLine();
			sb.append(tmp);
			st = new StringTokenizer(tmp);
			while (st.hasMoreTokens()) {
				int v = Integer.parseInt(st.nextToken());
				tSum[idx++] += v;
				sum += v;
			}
			sb.append(sum + " ");
			if (i != 2) sb.append("\n");
			tSum[idx] += sum;
			sum = 0;
			idx = 0;
		}
		System.out.println(sb);
		for (int i = 0; i < tSum.length; i++) {
			System.out.print(tSum[i] + " ");
		}
	}
}
