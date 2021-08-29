package Acmicpc.Geometry.TenThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexagonAndTriangle14264 {
	static double func(double L) {
		return L*L*Math.sqrt(3) / 4;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double L = Double.parseDouble(br.readLine());
		
		System.out.println(func(L));
	}
}
