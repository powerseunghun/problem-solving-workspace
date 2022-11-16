package Acmicpc.As.B4.TwentyThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LotsOfLiquid25991 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		double sum = 0;
		
		while (st.hasMoreTokens()) {
			sum += Math.pow(Double.parseDouble(st.nextToken()), 3);
		}
		
		System.out.println(Math.cbrt(sum));
		br.close();
	}
}
