package Acmicpc.NumberTheory.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FanDeath15633 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long sum = 0;
		
		for (int i = 1; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				sum += i*i == N ? i : i + (N/i);
			}
		}
		System.out.println(sum * 5 - 24);
	}
}
