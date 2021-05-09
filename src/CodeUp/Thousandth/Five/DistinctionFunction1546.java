package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistinctionFunction1546 {
	static String f(int n) {
		if (n > 0) return "plus";
		else if (n < 0) return "minus";
		else return "zero";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(f(n));
		
	}
}
