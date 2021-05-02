package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoDimensionArray1098 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int r = Integer.parseInt(tmp.split(" ")[0]), c = Integer.parseInt(tmp.split(" ")[1]);
		int n = Integer.parseInt(br.readLine()), l = 0, d = 0, x = 0, y = 0;
		int[][] arr = new int[r+2][c+2];
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			l = Integer.parseInt(tmp.split(" ")[0]);
			d = Integer.parseInt(tmp.split(" ")[1]);
			x = Integer.parseInt(tmp.split(" ")[2]);
			y = Integer.parseInt(tmp.split(" ")[3]);
			
			for (int j = 0; j < l; j++) {
				switch(d) {
				case 0:
					arr[x][y+j] = 1;
					break;
				case 1:
					arr[x+j][y] = 1;
					break;
				}
			}
		}
		
		for (int i = 1; i <= r; i++) {
			for (int j = 1; j <= c; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
