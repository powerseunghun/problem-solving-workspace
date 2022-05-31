package Acmicpc.As.B3.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hangover4655 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		double c = 0, sum = 0;
		int w = 0;
		
		while (true) {
			c = Double.parseDouble(br.readLine());
			if (c == 0) break;
			sum = 0;
			w = 1;
			while (sum < c) {
				sum += 1.0 / (w+1);
				w++;
			}
			sb.append((w-1) + " card(s)\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
