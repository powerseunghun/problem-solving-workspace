package Acmicpc.As.B4.TwoThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Circus20352 {
	static final double pi = 3.14159265358979;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		double res = Math.sqrt(a * pi * 4);
		
		System.out.printf("%.9f", res);
		br.close();
	}
}
