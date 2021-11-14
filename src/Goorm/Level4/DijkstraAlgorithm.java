package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DijkstraAlgorithm {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), start = 0;
		int[][] arr = new int[N+1][N+1];
		
		for (int i = 0, n1 = 0, n2 = 0, w = 0; i < M; i++) {
			tmp = br.readLine();
			n1 = Integer.parseInt(tmp.split(" ")[0]);
			n2 = Integer.parseInt(tmp.split(" ")[1]);
			w = Integer.parseInt(tmp.split(" ")[2]);
			arr[n1][n2] = arr[n1][n2] == 0 ? w : Math.min(w, arr[n1][n2]);
			arr[n2][n1] = arr[n2][n1] == 0 ? w : Math.min(w, arr[n2][n1]);
		}
		start = Integer.parseInt(br.readLine());
		
	}
}
