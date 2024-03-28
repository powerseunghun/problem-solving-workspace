package Acmicpc.As.B3.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Strict29752 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0, max = 0;
		
		while(st.hasMoreTokens()) {
			res = Integer.parseInt(st.nextToken()) == 0 ? 0 : res+1;
			max = Math.max(max, res);
		}
		
		System.out.println(max);
		br.close();
	}
}
