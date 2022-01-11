package CG.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberChoice {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		int ans = 0;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			ans = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				ans ^= Integer.parseInt(st.nextToken());
			}
			sb.append("Case #" + (i+1) + "\n");
			sb.append(ans + "\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
