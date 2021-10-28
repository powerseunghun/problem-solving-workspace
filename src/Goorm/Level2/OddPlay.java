package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddPlay {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), lastNumber = 1, weight = 6;
		
		for (int i = 1; i < N; i++) {
			lastNumber += weight;
			weight += 4;
		}
		
		System.out.println(3 * lastNumber - 6);
	}
}
