package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeComplexity {
	static int howManyPower(int N) {
		int idx = 1;
		while (true) {
			if (Math.pow(5, idx) > N) break;
			else idx++;
		}
		return idx;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), base = howManyPower(N), answer = 0;
		
		for (int i = 1; i < base; i++) {
			answer += (N / Math.pow(5, i));
		}
		
		System.out.println(answer);
	}
}
