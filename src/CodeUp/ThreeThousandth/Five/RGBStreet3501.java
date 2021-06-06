package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGBStreet3501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), min = 0;
		int[][] tCost = new int[N][3];
		int[][] cost = new int[N][3];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			cost[i][0] = Integer.parseInt(tmp.split(" ")[0]);
			cost[i][1] = Integer.parseInt(tmp.split(" ")[1]);
			cost[i][2] = Integer.parseInt(tmp.split(" ")[2]);
		}
		for (int i = 0; i < 3; i++) {
			tCost[0][i] = cost[0][i];
		}
		
		for (int i = 1; i < N; i++) {
			tCost[i][0] = Math.min(tCost[i-1][1], tCost[i-1][2]) + cost[i][0];
			tCost[i][1] = Math.min(tCost[i-1][0], tCost[i-1][2]) + cost[i][1];
			tCost[i][2] = Math.min(tCost[i-1][1], tCost[i-1][0]) + cost[i][2];
		}
		
		min = Math.min(tCost[N-1][2], Math.min(tCost[N-1][0], tCost[N-1][1]));
		System.out.println(min);
	}
}
