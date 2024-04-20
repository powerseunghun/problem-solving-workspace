package Acmicpc.As.B3.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RollDice6856 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1, v = 0; i <= m; i++) {
			v = 10-i;
			if (v >= 1 && v <= n) {
				res++;
			}
		}
		
		System.out.println(res == 1 ? "There is 1 way to get the sum 10." : "There are " + res + " ways to get the sum 10.");
		br.close();
	}
}
