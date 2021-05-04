package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitCalculation1278 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), digit = 0;
		
		while (n != 0) {
			digit++;
			n /= 10;
		}
		
		System.out.println(digit);
	}
}
