package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MakeTwoDimensionDiffArray1495 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(tmp.split(" ")[0]), 
				m = Integer.parseInt(tmp.split(" ")[1]), 
				k = Integer.parseInt(tmp.split(" ")[2]), sum = 0;
		
		int[][] d = new int[n+1][m+1];
		
		for (int i = 0, x1 = 0, x2 = 0, y1 = 0, y2 = 0, u = 0; i < k; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			u = Integer.parseInt(tmp.split(" ")[4]);
			
			d[x1][y1] += u;
			d[x2+1][y2+1] += u;
			d[x1][y2+1] -= u;
			d[x2+1][y1] -= u;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sb.append(d[i][j] + " ");
			}
			sb.append("\n");
		}
		sb.append("\n");
		
		sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				sum += d[i][j];
				d[i][j] = sum;
			}
			sum = 0;
		}
		
		sum = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				sum += d[j][i];
				d[j][i] = sum;
			}
			sum = 0;
		}
		System.out.println(sb);
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
	}
}
