package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EulerCircuit1199 {
	static int[][] arr = null;
	static StringBuilder sb = new StringBuilder();
	static void dfs(int V) {
		for (int i = 0; i < arr[V].length; i++) {
			while (arr[V][i] > 0) {
				arr[V][i]--;
				arr[i][V]--;
				dfs(i);
			}
		}
		sb.append((V+1) + " ");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		
		for (int i = 0, sum = 0; i < arr.length; i++, sum = 0) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0, val = 0; j < arr[i].length; j++) {
				val = Integer.parseInt(st.nextToken());
				arr[i][j] = val;
				sum += val;
			}
			if (sum % 2 != 0) {
				System.out.println("-1");
				return;
			}
		}
		dfs(0);
		
		System.out.println(sb.toString());
		br.close();
	}
}
