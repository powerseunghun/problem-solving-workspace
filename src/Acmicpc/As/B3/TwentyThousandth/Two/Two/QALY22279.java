package Acmicpc.As.B3.TwentyThousandth.Two.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QALY22279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double sum = 0, a = 0, b = 0;
		String tmp = null;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			sum += (a*b);
		}
		
		System.out.println(String.format("%.3f\n", sum));
		br.close();
	}
}
