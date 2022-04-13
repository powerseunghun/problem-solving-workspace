package Acmicpc.OrderSubmit.TenThousandth.Seven.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGBStreet17404 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine()), min = Integer.MAX_VALUE;
		int[][] tCost = new int[N][3];
		int[][] cost = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < 3; i++) {
			// first house
			for (int j = 0; j < 3; j++) {
				if (i == j) tCost[0][j] = cost[0][j];
				else tCost[0][j] = 1001;
			}
			for (int j = 1; j < N; j++) {
				tCost[j][0] = Math.min(tCost[j-1][1], tCost[j-1][2]) + cost[j][0];
				tCost[j][1] = Math.min(tCost[j-1][0], tCost[j-1][2]) + cost[j][1];
				tCost[j][2] = Math.min(tCost[j-1][1], tCost[j-1][0]) + cost[j][2];
				if(j == N-1) {
					switch(i) {
					case 0:
						min = Math.min(min, Math.min(tCost[N-1][1], tCost[N-1][2]));
						break;
					case 1:
						min = Math.min(min, Math.min(tCost[N-1][0], tCost[N-1][2]));
						break;
					case 2:
						min = Math.min(min, Math.min(tCost[N-1][1], tCost[N-1][0]));
						break;
					}
				}
			}
		}
		System.out.println(min);
		br.close();
	}
}
