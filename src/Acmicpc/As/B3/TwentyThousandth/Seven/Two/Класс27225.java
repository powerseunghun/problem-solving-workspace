package Acmicpc.As.B3.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Класс27225 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int max = Math.max(n, m), min = Math.min(n, m);
		
		System.out.println((min * 2) + ((max-min) % 2));
		br.close();
	}
}
