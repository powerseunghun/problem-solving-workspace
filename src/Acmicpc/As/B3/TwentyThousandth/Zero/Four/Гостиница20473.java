package Acmicpc.As.B3.TwentyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Гостиница20473 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), a = 0, b = 0, rem = 0;
		b = n/3;
		rem = n%3;
		
		while (rem%2 != 0) {
			rem += 3;
			b--;
		}
		
		System.out.println(rem/2 + " " + b);
		br.close();
	}
}
