package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PasswordDecorder1284 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), c1 = 0, c2 = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				c1 = 0;
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						c1 = 1;
						break;
					}
				}
				if (c1 == 0) {
					c2 = 0;
					for (int k = 2; k < n/i; k++) {
						if ((n / i) % k == 0) {
							c2 = 1;
							break;
						}
					}
					if (c2 == 0) {
						System.out.println(i + " " + n / i);
						return;
					}
				}
			}
		}
		System.out.println("wrong number");
	}
}
