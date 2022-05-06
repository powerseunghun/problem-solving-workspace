package Acmicpc.As.B4.TenThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gorivo14065 {
	static double g = 3.785411784;
	static double m = 1.609344;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double km = Double.parseDouble(br.readLine()) * m;
		
		System.out.printf("%.6f", g * 100 / km);
		br.close();
	}
}
