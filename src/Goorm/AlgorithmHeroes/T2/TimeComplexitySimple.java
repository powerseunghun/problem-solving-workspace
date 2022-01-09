package Goorm.AlgorithmHeroes.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeComplexitySimple {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		
		while (N > 0) {
			count += N/5;
			N /= 5;
		}
		
		System.out.println(count);
	}
}
