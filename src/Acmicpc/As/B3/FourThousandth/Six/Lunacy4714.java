package Acmicpc.As.B3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lunacy4714 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp1 = null, tmp2 = null;
		double X = 0;
		
		while (true) {
			X = Double.parseDouble(br.readLine());
			if (X == -1) break;
			tmp1 = String.format("%.2f", X);
			tmp2 = String.format("%.2f", X * 0.167);
			sb.append("Objects weighing " + tmp1 + " on Earth will weigh " + tmp2 + " on the moon.\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
