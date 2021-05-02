package CodeUp.Basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TwoDimensionArray1097 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[20][20];
		String tmp = null;
		int r = 0, c = 0, idx = 1;
		
		for (int i = 1; i < arr.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				arr[i][idx++] = Integer.parseInt(st.nextToken());
			}
			idx = 1;
		}
 		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			r = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			for (int j = 1; j < arr[r].length; j++) {
				arr[r][j] = arr[r][j] == 0 ? 1 : 0;
			}
			for (int j = 1; j < arr.length; j++) {
				arr[j][c] =  arr[j][c] == 0 ? 1 : 0;
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
