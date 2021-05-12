package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmeltIronOre1678 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[5+2][5+2];
		int[] rDir = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
		int[] cDir = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
		
		for (int i = 1; i <= 5; i++) {
			String tmp = br.readLine();
			for (int j = 1; j <= 5; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		int sum = 0, tmp = 0;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				tmp = 0;
				for (int k = 0; k < rDir.length; k++) {
					tmp += arr[i+rDir[k]][j+cDir[k]];
					sum = sum >= tmp ? sum : tmp;
				}
			}
		}
		System.out.println(sum);
	}
}
