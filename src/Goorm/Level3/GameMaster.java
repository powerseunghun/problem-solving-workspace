package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMaster {
	static final int limit = 100000000;
	static int getPer(int game, int win) {
		return (int) (((double)win / game) * 100);
	}
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int game = Integer.parseInt(tmp.split(" ")[0]);
		int win = Integer.parseInt(tmp.split(" ")[1]);
		int cur = (int) (((double)win / game) * 100);
		int l = 1, r = limit, m = 0;
		
		while (l < r) {
			m = (l+r)/2;
			int per = getPer(game+m, win+m);
			if (per <= cur) {
				l = m+1;
			}
			else r = m-1;
		}
		if (m == limit-1) {
			System.out.println("X");
			return;
		}
		System.out.println(m);
	}
}
