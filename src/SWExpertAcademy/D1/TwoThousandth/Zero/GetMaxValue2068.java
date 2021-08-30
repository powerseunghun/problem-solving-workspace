package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GetMaxValue2068 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), max = 0;
		
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine());
			max = Integer.MIN_VALUE;
			while (st.hasMoreTokens()) {
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			sb.append("#" + i + " " + max + "\n");
		}
		System.out.print(sb.toString());
	}
}
