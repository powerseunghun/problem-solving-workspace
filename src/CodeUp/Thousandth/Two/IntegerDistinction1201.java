package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerDistinction1201 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if (n > 0) {
			System.out.println("양수");
		}
		else if (n < 0) {
			System.out.println("음수");
		}
		else {
			System.out.println("0");
		}
	}
}
