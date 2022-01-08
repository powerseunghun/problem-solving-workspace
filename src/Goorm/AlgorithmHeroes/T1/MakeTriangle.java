package Goorm.AlgorithmHeroes.T1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeTriangle {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), count = 0, c = 0;
		
		for (int a = 1; a <= n/2; a++) {
			for (int b = 1; b <= n/2; b++) {
				c = n-(a+b);
				if (c == 0) continue;
				if (a < (b+c) && b <= c && c <= a) count++;
			}
		}
		System.out.println(count);
	}
}
