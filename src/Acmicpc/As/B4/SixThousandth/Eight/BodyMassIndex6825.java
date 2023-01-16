package Acmicpc.As.B4.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BodyMassIndex6825 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double w = Double.parseDouble(br.readLine());
		double h = Double.parseDouble(br.readLine());
		double res = w/Math.pow(h, 2);
		
		System.out.println(res > 25 ? "Overweight" : res >= 18.5 ? "Normal weight" : "Underweight");
		br.close();
	}
}
