package CodeUp.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SafeUnlock3411 {
	static String[][] safe = null;
	static void solution(int r, int c, int sr, int sc, boolean[][] check) {
		if (r < 0 || c < 0 || r > 5 || c > 5) return;
		if (check[r][c]) return;
		check[r][c] = true;
		
		boolean flag = true;
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check[i].length; j++) {
				if (!check[i][j]) flag = false;
			}
		}
		
		if (flag) {
			int idx = 0;
			for (int i = 0; i < safe.length; i++) {
				for (int j = 0; j < safe.length; j++) {
					idx++;
					if (i == sr && j == sc) {
						System.out.println(idx);
						break;
					}
				}
			}
			return;
		}
		
		int idx = safe[r][c].charAt(0) - '0';
		switch(safe[r][c].charAt(1)) {
		case 'R':
			solution(r, c+idx, sr, sc, check.clone());
			break;
		case 'L':
			solution(r, c-idx, sr, sc, check.clone());
			break;
		case 'D':
			solution(r+idx, c, sr, sc, check.clone());
			break;
		case 'U':
			solution(r-idx, c, sr, sc, check.clone());
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		safe = new String[6][6];
		boolean[][] check = new boolean[6][6];
		
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
		
		for (int i = 0; i < safe.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < safe[i].length; j++) {
				safe[i][j] = tmp.split(" ")[j];
			}
		}
		
		for (int i = 0; i < safe.length; i++) {
			for (int j = 0; j < safe[i].length; j++) {
				solution(i, j, i, j, check);
			}
		}
	}
}
