package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpStairs {
	static int[] mem = new int[31];
	static int getCount(int n) {
		if (mem[n] != 0) return mem[n];
		
		if (n <= 3) return mem[n] = n;
		
		return mem[n] = getCount(n-2) + getCount(n-1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(getCount(N));
	}
}
