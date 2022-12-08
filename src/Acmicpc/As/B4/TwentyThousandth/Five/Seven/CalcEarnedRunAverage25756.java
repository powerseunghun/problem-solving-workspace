package Acmicpc.As.B4.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CalcEarnedRunAverage25756 {
	static double calc(double V, int w) {
		return 100.0-(((1.0-V/100.0) * (1.0-w/100.0)) * 100);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double V = 0;
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int w = 0;
		
		while(st.hasMoreTokens()) {
			w = Integer.parseInt(st.nextToken());
			V = calc(V, w);
			sb.append(V + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
