package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CandyPang2605 {
	static int[][] candy = null;
	static int pang(int r, int c, int color) {
		if (r < 0 || c < 0 || r == candy.length || c == candy.length) return 0;
		
		if (candy[r][c] != color) return 0;
		if (candy[r][c] == color) {
			candy[r][c] = 0;
		}
		
		return pang(r-1, c, color) + pang(r+1, c, color) + 
			   pang(r, c-1, color) + pang(r, c+1, color) + 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		candy = new int[7][7];
		int pangArea = 0;
		
		for (int i = 0; i < 7; i++) {
			tmp = br.readLine();
			for (int j = 0; j < 7; j++) {
				candy[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		for (int i = 0; i < candy.length; i++) {
			for (int j = 0; j < candy[i].length; j++) {
				if (candy[i][j] == 0) continue;
				if (pang(i, j, candy[i][j]) > 2) pangArea++;
			}
		}
		
		System.out.println(pangArea);
	}
}
