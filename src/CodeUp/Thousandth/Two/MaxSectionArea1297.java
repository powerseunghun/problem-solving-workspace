package CodeUp.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxSectionArea1297 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int max = 0, b = 0;
		
		for (int i = 1; i < n / 2; i++) {
			int tmp = (n - i * 2) * i;
			if (tmp > max) {
				b = i;
				max = tmp;
			}
			else if (tmp == max) {
				if (b > i) {
					b = i;
				}
			}
		}
		System.out.println(b);
	}
}
