package Acmicpc.Geometry.TenThousandth.Six.Four;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CupNoodleHeight16479 {
	static double getHeight(int D1, int D2, int K) {
		double a = (D1-D2)/2.0;
		return Math.pow(K, 2) - Math.pow(a, 2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String tmp = br.readLine();
		int D1 = Integer.parseInt(tmp.split(" ")[0]);
		int D2 = Integer.parseInt(tmp.split(" ")[1]);
		
		if (D1==D2) {
			System.out.println(Math.pow(K, 2));
			return;
		}
		
		System.out.println(getHeight(D1, D2, K));
	}
}
