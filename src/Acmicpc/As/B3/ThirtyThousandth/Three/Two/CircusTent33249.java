package Acmicpc.As.B3.ThirtyThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircusTent33249 {
	static double pi = 3.14159265358979323846;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double d = Double.parseDouble(str.split(" ")[0]);
		double h = Double.parseDouble(str.split(" ")[1]);
		double r = d/2+5;
		double res = pi * Math.pow(r, 2) + pi * r * h * 2;
		
		System.out.println(res);
		br.close();
	}
}
