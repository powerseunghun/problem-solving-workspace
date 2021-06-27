package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumSqaureArea4423 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		int x1 = 0, y1 = 0, x2 = 0, y2 = 0, count = 0;
		String tmp = null;
		
		for (int a = 0; a < 4; a++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			x2 = Integer.parseInt(tmp.split(" ")[2]);
			y2 = Integer.parseInt(tmp.split(" ")[3]);
			
			for (int i = x1; i <= x2-1; i++) {
				for (int j = y1; j <= y2-1; j++) {
					arr[i][j] = 1;
				}
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				if (arr[i][j] != 0) count++;
			}
		}
		System.out.println(count);
	}
}
