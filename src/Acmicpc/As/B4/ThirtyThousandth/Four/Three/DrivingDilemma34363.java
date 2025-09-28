package Acmicpc.As.B4.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DrivingDilemma34363 {
	static double l = 5280/3600.0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		double D = Double.parseDouble(br.readLine());
		double T = Double.parseDouble(br.readLine());
		double V = S*l*T;
		
		System.out.println(D <= V ? "MADE IT" : "FAILED TEST");
		br.close();
	}
}
