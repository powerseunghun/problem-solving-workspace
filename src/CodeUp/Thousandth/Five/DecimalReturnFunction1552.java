package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalReturnFunction1552 {
	static double f(double n) {
		return n-(int)n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.printf("%.14f", f(Double.parseDouble(br.readLine())));
	}
}
