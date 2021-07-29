package Acmicpc.DataStructure;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Z1074 {
	static int count = 0;
	static int r = 0;
	static int c = 0;
	static void divide(int n, int y, int x) {
		if (y == r && x == c) {
			System.out.println(count);
			return;
		}
		int next = 0;
		if (y <= r && r < (y+n) && x <= c && c <(x+n)) {
			next = n/2;
			divide(next, y, x);
			divide(next, y, x+next);
			divide(next, y+next, x);
			divide(next, y + next, x + next);
		}
		else count += n * n;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		r = Integer.parseInt(tmp.split(" ")[1]);
		c = Integer.parseInt(tmp.split(" ")[2]);
		
		divide((int)Math.pow(2, N), 0, 0);
	}
}