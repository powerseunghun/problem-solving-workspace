package Goorm.AlgorithmHeroes.T8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfOne {
	static int func(int N) {
		int sum = 0, w = 0;
		while (N != 0) {
			sum += (Math.pow(16, w++) * (N % 10));
			N /= 10;
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int b1 = Integer.toBinaryString(N).replaceAll("0", "").length();
		int b2 = Integer.toBinaryString(func(N)).replaceAll("0", "").length();
		
		System.out.println(b1 + " " + b2);
		br.close();
	}
}
