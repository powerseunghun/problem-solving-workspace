package Acmicpc.NumberTheory.Thousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FoodCritic1188 {
	static int GCD(int a, int b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		if (N % M == 0) {
			System.out.println("0");
			return;
		}
		System.out.println(M - GCD(N, M));
	}
}
