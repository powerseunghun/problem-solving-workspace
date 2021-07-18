package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberingHouse2667 {
	static int[][] arr = null;
	static ArrayList<Integer> list = new ArrayList<>();
	static int count = 0;
	static void dfs(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr.length-1) return;
		if (arr[x][y] == 0) return;
		
		arr[x][y] = 0;
		count++;
		
		dfs(x, y-1);
		dfs(x-1, y);
		dfs(x+1, y);
		dfs(x, y+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j) - '0';
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 1) {
					count = 0; 
					dfs(i, j);
					list.add(count);
				}
			}
		}
		
		Collections.sort(list);
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
