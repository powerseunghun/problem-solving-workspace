package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadtree {
	static int[][] arr = null;
	static boolean check(int x, int y, int N) {
		int color = arr[x][y];
		
		for (int i = x; i < x+N; i++) {
			for (int j = y; j < y+N; j++) {
				if (color != arr[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			System.out.print(arr[x][y]);
			return;
		}
		
		if (check(x, y, N)) {
			System.out.print(arr[x][y]);
			return;
		}
		
		System.out.print("(");
		divide(x, y, N/2);
		divide(x, y+(N/2), N/2);
		divide(x+(N/2), y, N/2);
		divide(x+(N/2), y+(N/2), N/2);
		System.out.print(")");
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j)-'0';
			}
		}
		divide(0, 0, N);
		br.close();
	}
}
