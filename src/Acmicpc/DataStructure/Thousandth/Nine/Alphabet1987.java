package Acmicpc.DataStructure.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alphabet1987 {
	static int max = 0;
	static char[][] arr = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void search(int x, int y, String path, int count) {
		if (x < 0 || y < 0 || x > (arr.length-1) || y > (arr[x].length-1)) return;
		if (path.contains(arr[x][y]+"")) return;
		if (check[x][y]) return;
		check[x][y] = true;
		
		for (int i = 0; i < dirX.length; i++) {
			search(x+dirX[i], y+dirY[i], path+arr[x][y], count+1);
		}
		check[x][y] = false;
		
		max = Math.max(max, count);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[R][C];
		check = new boolean[R][C];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		search(0, 0, "", 1);
		System.out.println(max);
	}
}
