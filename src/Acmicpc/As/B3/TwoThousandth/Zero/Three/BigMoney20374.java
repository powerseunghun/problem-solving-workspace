package Acmicpc.As.B3.TwoThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigMoney20374 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double sum = 0;
		String str = null;
		
		while ((str = br.readLine()) != null) {
			sum += Double.parseDouble(str);
		}
		
		System.out.println(String.format("%.2f\n", sum));
		br.close();
		
	}
}
