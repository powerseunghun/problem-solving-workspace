package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ChoosingTeams {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		st.nextToken();
		int k = Integer.parseInt(st.nextToken()), cnt = 0;
		st = new StringTokenizer(br.readLine());
		
		while (st.hasMoreTokens()) {
			cnt += Integer.parseInt(st.nextToken()) + k <= 5 ? 1 : 0;
		}
		
		System.out.println(cnt/3);
		br.close();
	}
}
