package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTriangleFlowerBedLarge2626 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), count = 0;
		
		for (int a = 0; a <= n/2; a++) {
			for (int b = 0; b <= n/3; b++) {
				int c = n - (a + b);
				if (a < (b + c) && b <= c && c <= a) count++;
			}
		}
		
		System.out.println(count);
	}
}
