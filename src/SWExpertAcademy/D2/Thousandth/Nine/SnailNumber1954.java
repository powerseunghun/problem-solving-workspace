package SWExpertAcademy.D2.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnailNumber1954 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, th = 0, r = 0, c = -1, d = 1;
		int[][] arr = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			th = 0;
			r = 0;
			c = -1;
			d = 1;
			for (int val = 1; val <= N*N;) {
				for (int j = 0; j < N-th; j++) {
					c += d;
					arr[r][c] = val++;
				}
				for (int j = 0; j < N-th-1; j++) {
					r += d;
					arr[r][c] = val++;
				}
				th++;
				d = -d;
			}
			sb.append("#" + i + "\n");
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					sb.append(arr[j][k] + " ");
				}
				sb.append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}
