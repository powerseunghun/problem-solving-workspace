package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class YearendSettlement4056 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		double money = 0;
		
		if (n <= 500) {
			money = (n * 0.7);
		}
		else if (n <= 1500) {
			money = 350 + ((n - 500) * 0.4);
		}
		else if (n <= 4500) {
			money = 750 + ((n - 1500) * 0.15);
		}
		else if (n <= 10000) {
			money = 1200 + ((n - 4500) * 0.05);
		}
		else {
			money = 1475 + ((n - 10000) * 0.02);
		}
		System.out.printf("%d\n", (int)money);
	}
}
