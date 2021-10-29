package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LampProgramming {
	static void func(int[][] arr, int dir, int line) {
		if (dir == 0) {
			if (line > arr.length-1) return;
			for (int i = 1; i < arr[line].length; i++) {
				arr[line][i] = arr[line][i] == 0 ? 1 : 0;
			}
		}
		else if (dir == 1) {
			if (line > arr[0].length-1) return;
			for (int i = 1; i < arr.length; i++) {
				arr[i][line] = arr[i][line] == 0 ? 1 : 0;
			}
		}
	}
	static void print(int[][] arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]), p = 0;
		int[][] arr = new int[R+1][C+1];
		
		for (int i = 1; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		p = Integer.parseInt(br.readLine());
		
		for (int i = 0, dir = 0, line = 0; i < p; i++) {
			tmp = br.readLine();
			dir = Integer.parseInt(tmp.split(" ")[0]);
			line = Integer.parseInt(tmp.split(" ")[1]);
			func(arr, dir, line);
		}
		
		print(arr);
	}
}
