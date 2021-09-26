package SWExpertAcademy.D4.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class NumbersOnGrid2819 {
	static int[][] arr = null;
	static Set<String> set = new HashSet<>();
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void dfs(int x, int y, int m, String s) {
		if (m == 6) {
			set.add(s);
			return;
		}
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr.length-1) continue;
			dfs(nx, ny, m+1, s+arr[nx][ny]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			set.clear();
			arr = new int[4][4];
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					dfs(j, k, 0, arr[j][k]+"");
				}
			}
			sb.append("#" + i + " " + set.size() + "\n");
		}
		System.out.print(sb.toString());
	}
}
