package Goorm.AlgorithmHeroes.T4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SavingSpiritGuard {
	static String func(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
				if (i * i != n) count++;
			}
		}
		return count % 2 == 0 ? "no" : "yes";
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(func(n));
		br.close();
	}
}
