package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VirusSpread2776 {
	static boolean check = true;
	static int[][] arr = null;
	static void solution(int x, int y, int N, int n, int d) {
		if (x == 0 || y == 0 || x == N+1 || y == N+1 || n > d) return;
		if (arr[x][y] == 1) {
			check = false;
			return;
		}
		arr[x][y] = 3;
		
		solution(x-1, y, N, n+1, d);
		solution(x, y-1, N, n+1, d);
		solution(x, y+1, N, n+1, d);
		solution(x+1, y, N, n+1, d);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[] schoolx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] schooly = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		arr = new int[N+2][N+2];
		tmp = br.readLine();
		int x1 = Integer.parseInt(tmp.split(" ")[0]);
		int y1 = Integer.parseInt(tmp.split(" ")[1]);
		arr[x1][y1] = 1;
		for (int i = 0; i < schoolx.length; i++) {
			arr[x1+schoolx[i]][y1+schooly[i]] = 1;
		}
		
		tmp = br.readLine();
		int x2 = Integer.parseInt(tmp.split(" ")[0]);
		int y2 = Integer.parseInt(tmp.split(" ")[1]);
		arr[x2][y2] = 3;
		
		int D = Integer.parseInt(br.readLine());
		
		solution(x2, y2, N, 0, D);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		if (check) System.out.println("0");
		else System.out.println("1");
	}
}
