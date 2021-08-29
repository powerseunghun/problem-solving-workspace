package Acmicpc.Geometry.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CircleInDish16483 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		double res = Math.pow(T/2.0, 2);
		
		System.out.println((int)res);
	}
}
