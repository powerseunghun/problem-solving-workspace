package Acmicpc.As.B3.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class AnIntermediateWar4435 {
	static int[] scores1 = {1, 2, 3, 3, 4, 10}, scores2 = {1, 2, 2, 2, 3, 5, 10};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), sum1 = 0, sum2 = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= T; i++) {
			sum1 = 0;
			sum2 = 0;
			for (int j = 0; j < 2; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < (j==0 ? scores1.length : scores2.length); k++) {
					if (j == 0) {
						sum1 += (Integer.parseInt(st.nextToken()) * scores1[k]);
					}
				
					else sum2 += (Integer.parseInt(st.nextToken()) * scores2[k]);
				}
			}
			sb.append("Battle " + i + ": ");
			if (sum1 > sum2) sb.append("Good triumphs over Evil\n");
			else if (sum1 < sum2) sb.append("Evil eradicates all trace of Good\n");
			else sb.append("No victor on this battle field\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
