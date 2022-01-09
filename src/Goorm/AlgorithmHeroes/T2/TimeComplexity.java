package Goorm.AlgorithmHeroes.T2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeComplexity {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), base = 1, answer = 0;
		while (true) {
			if (Math.pow(5, base) > N) {
				break;
			}
			else base++;
		}
		for (int i = 1; i < base; i++) {
			answer += (N / Math.pow(5, i));
		}
		
		System.out.println(answer);
	}
}
