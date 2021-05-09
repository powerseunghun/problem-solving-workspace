package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlooringFunction1554 {
	static int f(double n) {
		if (n < 0) {
			return (int)((n*-1)+1) * -1;
		}
		else return (int)n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Double.parseDouble(br.readLine())));
	}
}
