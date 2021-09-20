package SWExpertAcademy.D3.TwoThousandth.Eight;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LongestPath2814 {
	static int[][] arr = null;
	static boolean[] check = null;
	static int count = 0;
	static void search(int n, int v) {
		check[v] = true;
		for (int i = 1; i < arr[v].length; i++) {
			if (arr[v][i] == 1 && !check[i]) {
				search(n+1, i);
				check[i] = false;
			}
		}
		count = Math.max(n, count);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		
		for (int i = 1; i <= T; i++) {
			count = Integer.MIN_VALUE;
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N+1][N+1];
			check = new boolean[N+1];
			for (int j = 0, a = 0, b = 0; j < M; j++) {
				tmp = br.readLine();
				a = Integer.parseInt(tmp.split(" ")[0]);
				b = Integer.parseInt(tmp.split(" ")[1]);
				arr[a][b] = 1;
				arr[b][a] = 1;
			}
			for (int j = 1; j < arr.length; j++) {
				search(1, j);
				check[j] = false;
			}
			sb.append("#" + i + " " + count + "\n");
		}
		System.out.print(sb.toString());
	}
}
