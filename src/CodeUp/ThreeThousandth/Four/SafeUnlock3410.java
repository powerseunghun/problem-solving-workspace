package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SafeUnlock3410 {
	static char[][] safe = null;
	static void solution(int r, int c, int sr, int sc, boolean[][] check) {
		if (r < 0 || c < 0 || r > 3 || c > 3) return;
		if (check[r][c]) return;
		check[r][c] = true;
		
		boolean flag = true;
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check[i].length; j++) {
				if (!check[i][j]) flag = false;
			}
		}
		
		if (flag) {
			System.out.println((sr+1) + " " + (sc+1));
			return;
		}
		
		switch(safe[r][c]) {
		case 'R':
			solution(r, c+1, sr, sc, check.clone());
			break;
		case 'L':
			solution(r, c-1, sr, sc, check.clone());
			break;
		case 'D':
			solution(r+1, c, sr, sc, check.clone());
			break;
		case 'U':
			solution(r-1, c, sr, sc, check.clone());
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		safe = new char[4][4];
		boolean[][] check = new boolean[4][4];
		
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
		
		for (int i = 0; i < safe.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < safe[i].length; j++) {
				safe[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < safe.length; i++) {
			for (int j = 0; j < safe[i].length; j++) {
				solution(i, j, i, j, check);
			}
		}
	}
}
