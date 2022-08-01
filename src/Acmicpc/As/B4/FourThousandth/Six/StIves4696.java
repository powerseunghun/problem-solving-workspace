package Acmicpc.As.B4.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StIves4696 {
	static double func(double d) {
		double sum = 1;
		for (int i = 1; i <= 4; i++) {
			sum += Math.pow(d, i);
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double d = 0;
		
		while (true) {
			d = Double.parseDouble(br.readLine());
			if (d == 0) break;
			sb.append(String.format("%.2f\n", func(d)));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
