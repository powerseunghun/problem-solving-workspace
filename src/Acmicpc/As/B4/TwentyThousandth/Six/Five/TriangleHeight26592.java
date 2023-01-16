package Acmicpc.As.B4.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleHeight26592 {
	static String func(double a, double b) {
		double h = a*2/b;
		return String.format("The height of the triangle is %.2f units", h);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double a = 0, b = 0;
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			a = Double.parseDouble(tmp.split(" ")[0]);
			b = Double.parseDouble(tmp.split(" ")[1]);
			sb.append(func(a, b) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
