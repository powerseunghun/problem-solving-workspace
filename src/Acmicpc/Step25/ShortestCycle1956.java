package Acmicpc.Step25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ShortestCycle1956 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int V = Integer.parseInt(tmp.split(" ")[0]);
		int E = Integer.parseInt(tmp.split(" ")[1]);
		int a = 0, b = 0, c = 0, min = Integer.MAX_VALUE;
		int[][] arr = new int[V+1][V+1];
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i != j) arr[i][j] = 10000*V+1;
			}
		}
		
		for (int i = 0; i < E; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			c = Integer.parseInt(tmp.split(" ")[2]);
			arr[a][b] = c;
		}
		
		for (int k = 1; k < arr.length; k++) {
			for (int i = 1; i < arr.length; i++) {
				for (int j = 1; j < arr.length; j++) {
					if (i == j) continue;
					arr[i][j] = Math.min(arr[i][j], arr[i][k] + arr[k][j]);
				}
			}
		}
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (i == j) continue;
				if (arr[i][j] != 10000*V+1 && arr[j][i] != 10000*V+1) {
					min = Math.min(arr[i][j] + arr[j][i], min);
				}
			}
		}
		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
	}
}
