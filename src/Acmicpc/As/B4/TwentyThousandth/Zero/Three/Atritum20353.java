package Acmicpc.As.B4.TwentyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Atritum20353 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double res = Math.pow(a * 16, 0.5);
		
		System.out.printf("%.8f", res);
		br.close();
	}
}
