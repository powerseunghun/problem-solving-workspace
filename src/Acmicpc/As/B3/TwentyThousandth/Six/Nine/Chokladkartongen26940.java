package Acmicpc.As.B3.TwentyThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chokladkartongen26940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cur = Integer.parseInt(st.nextToken()), val = 0, cnt = 0;
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (cur < val) cnt++;
			cur = val;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
