package bird;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeColorPaper {
	static int white = 0, blue = 0;
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
		// 같은 색
		if (color == 1) blue++;
		else white++;
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			if (arr[x][y] == 1) blue++;
			else white++;
			return;
		}
		
		if (check(x, y, N)) return;
		
		divide(x, y, N/2);
		divide(x, y+(N/2), N/2);
		divide(x+(N/2), y, N/2);
		divide(x+(N/2), y+(N/2), N/2);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		divide(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
		br.close();
	}
}
