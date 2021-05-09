package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CeilingFunction1553 {
	static int f(double n) {
		long t = (long) n;
		
		if (t < n) {
			return (int)n+1;
		}
		else {
			return (int)n;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Double.parseDouble(br.readLine())));
	}
}
