package Goorm.Level3;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ImageProcessing {
	static char[][] arr = null;
	static int count = 0, area = 0, maxArea = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void func(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr[x].length-1) return;
		else if (arr[x][y] == '.') return;
		
		arr[x][y] = '.';
		area++;
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			func(nx, ny);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[M][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == '#') {
					area = 0;
					count++;
					func(i, j);
					maxArea = Math.max(area, maxArea);
				}
			}
		}
		System.out.println(count);
		System.out.println(maxArea);
	}
}
