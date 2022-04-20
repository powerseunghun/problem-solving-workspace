package Codeforce.OrderSubmit.OneThousandth.FiveHundred;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalculatingFunction {
	static long getCalc(long n) {
		if (n % 2 == 0) {
			return n/2;
		}
		else {
			return getCalc(n-1) - n;
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(getCalc(n));
		br.close();
	}
}
