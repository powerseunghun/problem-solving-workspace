package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisorCountFunction1557 {
	static int f(int n) {
		int count = 0;
		
		for (int i = 1; i <= n; i++) {
			count = n % i == 0 ? count+1 : count;
		}
		return count;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(f(Integer.parseInt(br.readLine())));
	}
}
