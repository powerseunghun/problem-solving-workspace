package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoDimensionArrayPartialSum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), sx = 0, sy = 0, ex = 0, ey = 0, sum = 0;
		int[][] arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		tmp = br.readLine();
		sx = Integer.parseInt(tmp.split(" ")[0]);
		sy = Integer.parseInt(tmp.split(" ")[1]);
		ex = Integer.parseInt(tmp.split(" ")[2]);
		ey = Integer.parseInt(tmp.split(" ")[3]);

		for (int i = sx; i <= ex; i++) {
			for (int j = sy; j <= ey; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
