package CG.Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinomialCoefficient {
	static int[][] mem = null;
	static void memInit() {
		for (int i = 0; i < mem.length; i++) {
			Arrays.fill(mem[i], -1);
		}
	}
	static int getBino(int n, int r) {
		if (n==r || r==0) return 1;
		if (mem[n][r] != -1) return mem[n][r];
		return mem[n][r] = getBino(n-1, r-1) + getBino(n-1, r);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int r = Integer.parseInt(tmp.split(" ")[1]);
		mem = new int[n+1][r+1];
		memInit();
		
		System.out.println(getBino(n, r));
		br.close();
	}
}
