package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColrPaper4592 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), x = 0, y = 0, count = 0;
		int[][] arr = new int[101][101];
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			
			for (int j = x; j < x+10; j++) {
				for (int k = y; k < y+10; k++) {
					arr[j][k] = 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 0) count++;
			}
		}
		System.out.println(count);
	}
}
