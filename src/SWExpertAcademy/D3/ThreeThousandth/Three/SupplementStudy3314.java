package SWExpertAcademy.D3.ThreeThousandth.Three;

import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class SupplementStudy3314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), val = 0, sum = 0;
		
		for (int i = 1; i <= T; i++) {
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sum += val < 40 ? 40 : val;
			}
			sb.append("#" + i + " " + sum/5 + "\n");
		}
		System.out.print(sb.toString());
	}
}
