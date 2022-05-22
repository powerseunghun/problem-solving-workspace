package Acmicpc.As.B4.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IceCream24087 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int sum = 250, count = 0;
		
		while (A + B * count < S) {
			sum += 100;
			count++;
		}
		
		System.out.println(sum);
		br.close();
	}
}
