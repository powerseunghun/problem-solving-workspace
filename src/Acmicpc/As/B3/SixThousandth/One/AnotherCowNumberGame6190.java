package Acmicpc.As.B3.SixThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnotherCowNumberGame6190 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine()), score = 0;
		
		while (N != 1) {
			N = N % 2 != 0 ? N*3+1 : N/2;
			score++;
		}
		
		System.out.print(score);
		br.close();
	}
}
