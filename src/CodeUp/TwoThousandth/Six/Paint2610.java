package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paint2610 {
	static void fill(int x, int y, char[][] paint) {
		if (x == -1 || x == 10 || y == -1 || y == 10) return;
		if (paint[y][x] == '*') return;
		else {
			paint[y][x] = '*';
			fill(x, y-1, paint);
			fill(x, y+1, paint);
			fill(x-1, y, paint);
			fill(x+1, y, paint);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int x = 0, y = 0;
		char[][] paint = new char[10][10];
		
		for (int i = 0; i < paint.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < paint[i].length; j++) {
				paint[i][j] = tmp.charAt(j);
			}
		}
		tmp = br.readLine();
		x = Integer.parseInt(tmp.split(" ")[0]);
		y = Integer.parseInt(tmp.split(" ")[1]);
		
//		fill(x, y, paint);
		for (int i = 0; i < paint.length; i++) {
			for (int j = 0; j < paint[i].length; j++) {
				System.out.print(paint[i][j]);
			}
			System.out.println();
		}
	}
}
