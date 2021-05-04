package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeDistinction1274 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		
		for (int i = 1; i <= N; i++) {
			count = N % i == 0 ? count + 1 : count;
		}
		
		if (count == 2) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}
	}
}
