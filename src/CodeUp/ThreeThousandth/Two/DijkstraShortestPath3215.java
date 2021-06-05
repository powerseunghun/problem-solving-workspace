package CodeUp.ThreeThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DijkstraShortestPath3215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int V = Integer.parseInt(tmp.split(" ")[1]);
		int r = 0, c = 0, w = 0;
		int[][] maps = new int[N+1][N+1];
		int[] distance = new int[N+1];
		boolean[] visit = new boolean[N+1];
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		Arrays.fill(visit, false);
		for (int i = 0; i < maps.length; i++) {
			Arrays.fill(maps[i], 0);
		}
		
		for (int i = 0; i < V; i++) {
			tmp = br.readLine();
			r = (int) (tmp.split(" ")[0].charAt(0)) - 65;
			c = (int) (tmp.split(" ")[1].charAt(0)) - 65;
			w = Integer.parseInt(tmp.split(" ")[2]);
			maps[r][c] = w;
			maps[c][r] = w;
		}
		tmp = br.readLine();
		r = (int) (tmp.split(" ")[0].charAt(0)) - 65;
		c = (int) (tmp.split(" ")[1].charAt(0)) - 65;
		
		distance[r] = 0;
		visit[r] = true;
		
		for (int i = 1; i < N+1; i++) {
			if (maps[r][i] != 0 && !visit[i]) {
				distance[i] = maps[r][i];
			}
		}
		
		for (int i = 0; i < N-1; i++) {
			int min = Integer.MAX_VALUE;
			int minIdx = -1;
			
			for (int j = 1; j < N+1; j++) {
				if (!visit[j] && distance[j] != Integer.MAX_VALUE) {
					if (distance[j] < min) {
						min = distance[j];
						minIdx = j;
					}
				}
			}
			visit[minIdx] = true;
			for (int j = 1; j < N+1; j++) {
				if (!visit[j] && maps[minIdx][j] != 0) {
					if (distance[j] > distance[minIdx]+maps[minIdx][j]) {
						distance[j] = distance[minIdx]+maps[minIdx][j];
					}
				}
			}
		}
		
		System.out.println(distance[c]);
	}
}
