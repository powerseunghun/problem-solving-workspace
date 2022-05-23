package Acmicpc.As.B4.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Betting24751 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		double res1 = 100.0 / a, res2 = 100.0 / (100-a);
		
		System.out.printf("%.10f\n", res1);
		System.out.printf("%.10f\n", res2);
		br.close();
	}
}
