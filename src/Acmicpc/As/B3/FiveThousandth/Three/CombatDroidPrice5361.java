package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CombatDroidPrice5361 {
	static double[] price = { 350.34, 230.90, 190.55, 125.30, 180.90 };
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		double sum = 0;
		StringTokenizer st = null;
		
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			sum = 0;
			for (int i = 0; i < price.length; i++) {
				sum += price[i] * Integer.parseInt(st.nextToken());
			}
			sb.append(String.format("$%.2f\n", sum));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
