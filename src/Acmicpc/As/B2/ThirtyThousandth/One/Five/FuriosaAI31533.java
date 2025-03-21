package Acmicpc.As.B2.ThirtyThousandth.One.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FuriosaAI31533 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		String str = br.readLine();
		double m = Double.parseDouble(str.split(" ")[0]);
		double n = Double.parseDouble(str.split(" ")[1]);
		
		double r1 = Math.max(m, n/a);
		double r2 = Math.max(m/a, n);
		double res = Math.min(r1, Math.min(r2, Math.min(m/a*2, n/a*2)));
		
		System.out.println(String.format("%.07f", res));
		br.close();
	}
}
