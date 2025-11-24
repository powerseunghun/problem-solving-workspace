package Acmicpc.As.B2.TenThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EulersNumber16515 {
	static double func(int n) {
		double res = 1;
		for (int i = 1; i <= n; i++) {
			res /= i;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double res = 0;

		for (int i = 0; i <= n; i++) {
			res += func(i);
		}
		
		System.out.println(res);
		br.close();
	}
}
