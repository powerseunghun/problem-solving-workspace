package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BulbControl4060 {
	static int onCount = 0;
	static int offCount = 0;
	static void on(int x, int y, int n, int m, int st, int[][] arr) {
		if (x < 0 || y < 0 || x >= n || y >= m) return;
		
		if (arr[x][y] != st) return;
		if (arr[x][y] == st) {
			arr[x][y] = arr[x][y] == 1 ? 0 : 1;
		}
		
		on(x, y-1, n, m, st, arr);
		on(x-1, y, n, m, st, arr);
		on(x, y+1, n, m, st, arr);
		on(x+1, y, n, m, st, arr);
	}
	static void solution(int st, int n, int m, int[][] arr) {
		int[][] solArr = arr.clone();
		for (int i = 0; i < solArr.length; i++) {
			for (int j = 0; j < solArr[i].length; j++) {
				if (solArr[i][j] == st) {
//					System.out.println(i + ", " + j);
					if (st == 0) {
						onCount++;
					}
					else offCount++;
					on(i, j, n, m, st, arr);
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int[][] base = new int[n][m];
		
		for (int i = 0; i < base.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < base[i].length; j++) {
				base[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		int[][] arr = new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = base[i][j];
			}
		}
		solution(0, n, m, arr);
		arr = base.clone();
		solution(1, n, m, base.clone());
		
		System.out.println(onCount);
		System.out.println(offCount);
	}
}
