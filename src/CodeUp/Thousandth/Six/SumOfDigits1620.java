package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfDigits1620 {
	static int getDigitSum(int n) {
		int sum = 0;
		while (true) {
			while (n != 0) {
				sum += n % 10;
				n /= 10;
			}
			if (sum / 10 == 0) break;
			else {
				n = sum;
				sum = 0;
			}
		}
		return sum;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getDigitSum(Integer.parseInt(br.readLine())));
	}
}
