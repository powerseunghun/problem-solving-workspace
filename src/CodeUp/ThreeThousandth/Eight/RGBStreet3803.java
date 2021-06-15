package CodeUp.ThreeThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RGBStreet3803 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[][] cost = new int[N][3];
		int[][] arr = new int[N][3];
		
		for (int i = 0; i < cost[0].length; i++) {
			tmp = br.readLine();
			cost[i][0] = Integer.parseInt(tmp.split(" ")[0]);
			cost[i][1] = Integer.parseInt(tmp.split(" ")[1]);
			cost[i][2] = Integer.parseInt(tmp.split(" ")[2]);
		}
		
		for (int i = 0; i < cost[0].length; i++) {
			arr[0][i] = cost[0][i];
		}
		
		for (int i = 1; i < N; i++) {
			arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + cost[i][0];
			arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + cost[i][1];
			arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + cost[i][2];
		}
		
		System.out.println(Math.min(arr[N-1][0], Math.min(arr[N-1][1], arr[N-1][2])));
		
	}
}
