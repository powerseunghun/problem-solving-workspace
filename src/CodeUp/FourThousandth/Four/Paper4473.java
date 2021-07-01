package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paper4473 {
	static int blueCount = 0;
	static int whiteCount = 0;
	static boolean check(int x, int y, int N, int[][] paper) {
		int color = paper[x][y];
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (paper[i][j] != color) return false;
			}
		}
		if (color == 1) blueCount++;
		else whiteCount++;
		
		return true;
	}
	static void divide(int x, int y, int N, int[][] paper) {
		if (N == 1) {
			if (paper[x][y] == 1) blueCount++;
			else whiteCount++;
			return;
		}
		
		if (check(x, y, N, paper)) {
			return;
		}
		divide(x, y, N/2, paper);
		divide(x, y+(N/2), N/2, paper);
		divide(x+(N/2), y, N/2, paper);
		divide(x+(N/2), y+(N/2), N/2, paper);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		int[][] paper = new int[n][n];
		
		for (int i = 0; i < paper.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < paper[i].length; j++) {
				paper[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		divide(0, 0, n, paper);
		System.out.println(whiteCount);
		System.out.println(blueCount);
//		for (int i = 0; i < paper.length; i++) {
//			for (int j = 0; j < paper[i].length; j++) {
//				System.out.print(paper[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
