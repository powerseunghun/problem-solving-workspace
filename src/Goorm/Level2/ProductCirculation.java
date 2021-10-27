package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProductCirculation {
	static int denominator = 0, numerator = 0;
	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a%b);
	}
	static void makeReducedFraction(double R) {
		int weight = 1;
		
		while (R-(int)R != 0) {
			weight *= 10;
			R *= weight;
		}
		
		int gcd = GCD((int)R, weight);
		System.out.println((int) R);
		numerator = (int)R / gcd;
		denominator = weight / gcd;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		int[] percents = null;
		double R = 0;
		
		
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			R = Double.parseDouble(tmp.split(" ")[1]);
			percents = new int[N];
			tmp = br.readLine();
			for (int j = 0; j < percents.length; j++) {
				percents[j] = Integer.parseInt(tmp.split(" ")[j]);
			}
			
			for (int j = 0; j < percents.length; j++) {
				R -= (R*percents[j] / 100);
			}
			System.out.println("R: " + R);
			makeReducedFraction(R);
			
			sb.append(numerator + "/" + denominator + "\n");
		}
		System.out.print(sb.toString());
	}
}
