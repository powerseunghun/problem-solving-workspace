package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Absolutely26500 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		double a = 0, b = 0;
		
		while(N-- > 0) {
			tmp = br.readLine();
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			sb.append(String.format("%.1f\n", Math.abs(a-b)));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
