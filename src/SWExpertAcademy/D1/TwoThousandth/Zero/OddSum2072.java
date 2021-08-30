package SWExpertAcademy.D1.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OddSum2072 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), sum = 0, val = 0;
		
		for (int i = 1; i <= T; i++) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				if (val % 2 != 0) sum += val;
			}
			sb.append("#" + i + " " + sum + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
