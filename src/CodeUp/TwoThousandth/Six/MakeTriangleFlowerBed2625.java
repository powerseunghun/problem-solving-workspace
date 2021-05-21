package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTriangleFlowerBed2625 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), count = 0;
		
		for (int a = 1; a <= n; a++) {
			for (int b = 1; b <= (n - a); b++) {
				for (int c = 1; c <= (n - (a+b)); c++) {
					if (c < (a+b) && a <= b && b <= c && a + b + c == n) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
	}
}
