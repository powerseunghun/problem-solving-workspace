package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SportsDay24088 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int K = Integer.parseInt(br.readLine()), res = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			res = str.charAt(i) == 'R' ? res + 1 : res;
		}
		
		System.out.println(res == K ? "W" : "R");
		br.close();
	}
}
