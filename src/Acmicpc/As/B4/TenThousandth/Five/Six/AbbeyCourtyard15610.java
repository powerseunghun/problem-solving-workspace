package Acmicpc.As.B4.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbbeyCourtyard15610 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		
		System.out.printf("%.8f", Math.sqrt(a) * 4);
		br.close();
	}
}
