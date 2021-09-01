package SWExpertAcademy.D2.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlyKill2001 {
	static int getCount(int[][] arr, int M) {
		int count = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				count = 0;
				for (int k = 0; k < M; k++) {
					for (int l = 0; l < M; l++) {
						if (i+k >= arr.length || j + l >= arr.length) continue;
						count += arr[i+k][j+l];
					}
				}
				max = Math.max(max, count);
			}
		}
		return max;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), N = 0, M = 0;
		int[][] arr = null;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			N = Integer.parseInt(tmp.split(" ")[0]);
			M = Integer.parseInt(tmp.split(" ")[1]);
			arr = new int[N][N];
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
				for (int k = 0; k < N; k++) {
					arr[j][k] = Integer.parseInt(tmp.split(" ")[k]);
				}
			}
			sb.append("#" + i + " " + getCount(arr, M) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
