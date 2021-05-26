package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DeathFlower2766 {
	static void check(int x, int y, int[][] arr, int[] dirx, int[] diry) {
		arr[x][y] = 0;
		for (int i = 0; i < dirx.length; i++) {
			arr[x+dirx[i]][y+diry[i]] = 0;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), K = 0, sum = 0;
		int[][] arr = new int[N+2][N+2];
		int[] dirx = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] diry = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= N; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		K = Integer.parseInt(br.readLine());
		for (int i = 0, x = 0, y = 0; i < K; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			check(x, y, arr, dirx, diry);
		}
		
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				sum += arr[i][j];
			}
		}
		
		System.out.println(sum);
	}
}
