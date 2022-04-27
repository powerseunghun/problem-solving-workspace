package Acmicpc.As.B5.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FootballScoring24736 {
	static int[] scores = {6, 3, 2, 1, 2};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] sum = new int[2];
		StringTokenizer st = null;
		
		for (int i = 0, idx = 0; i < sum.length; i++, idx = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				sum[i] += Integer.parseInt(st.nextToken()) * scores[idx++];
			}
		}
		
		System.out.println(sum[0] + " " + sum[1]);
		br.close();
	}
}