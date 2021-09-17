package SWExpertAcademy.D3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HangDownSound4676 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String str = null;
		int[] hyp = new int[21];
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			Arrays.fill(hyp, 0);
			str = br.readLine();
			br.readLine();
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				hyp[Integer.parseInt(st.nextToken())]++;
			}
			sb.append("#" + i + " ");
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < hyp[j]; k++) {
					sb.append("-");
				}
				sb.append(str.charAt(j));
			}
			for (int j = 0; j < hyp[str.length()]; j++) {
				sb.append("-");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
