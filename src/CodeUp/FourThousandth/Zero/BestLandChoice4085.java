package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BestLandChoice4085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]);
		int n = Integer.parseInt(tmp.split(" ")[1]);
		int x = Integer.parseInt(tmp.split(" ")[2]);
		int y = Integer.parseInt(tmp.split(" ")[3]);
		int[][] arr = new int[n][m];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		int sum = 0, max = 0;
		for (int i = 0; i < arr.length-y+1; i++) {
			for (int j = 0; j < arr[i].length-x+1; j++) {
				for (int k = 0; k < y; k++) {
					for (int z = 0; z < x; z++) {
						sum += arr[i+k][j+z];
					}
				}
				max = sum >= max ? sum : max;
				sum = 0;
			}
		}
		System.out.println(max);
	}
}
