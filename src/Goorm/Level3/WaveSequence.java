package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WaveSequence {
	static int[] mem = new int[51];
	static int getP(int N) {
		if (mem[N] != 0) return mem[N];
		
		if (N <= 3) return mem[N] = 1;
		else return mem[N] = getP(N-2) + getP(N-3);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getP(N));
	}
}
