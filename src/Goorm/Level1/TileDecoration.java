package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TileDecoration {
	static long[] mem = null;
	static long getRound(int n) {
		if (n == 1) return 4;
		else if (n == 2) return 6;
		else {
			if (mem[n] != 0) return mem[n];
			else return mem[n] = getRound(n-2) + getRound(n-1);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		mem = new long[N+1];
		
		System.out.println(getRound(N));
	}
}
