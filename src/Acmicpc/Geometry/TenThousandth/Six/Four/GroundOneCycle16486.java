package Acmicpc.Geometry.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GroundOneCycle16486 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final double PI = 3.141592;
		double d1 = Double.parseDouble(br.readLine());
		double d2 = Double.parseDouble(br.readLine());
		double ans = (d2 * PI) * 2 + (2 * d1);
		System.out.println(ans);
	}
}
