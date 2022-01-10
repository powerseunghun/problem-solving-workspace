package Goorm.AlgorithmHeroes.T7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PerfectNumber {
	static boolean isPerfect(int n) {
		if (n == 1) return false;
		int sum = 0;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				sum += i;
				if (i * i != n) sum += (n/i);
			}
		}
		return (sum+1) == n ? true : false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = A; i <= B; i++) {
			if (isPerfect(i)) sb.append(i + " ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
