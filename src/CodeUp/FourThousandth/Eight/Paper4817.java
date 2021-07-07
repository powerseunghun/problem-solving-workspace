package CodeUp.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Paper4817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[][] arr = new int[1001][1001];
		int N = Integer.parseInt(br.readLine());
		int[] cnts = new int[N+1];
		int x1 = 0, y1 = 0, width = 0, height = 0;
		
		for (int i = 0 ; i < N; i++) {
			tmp = br.readLine();
			x1 = Integer.parseInt(tmp.split(" ")[0]);
			y1 = Integer.parseInt(tmp.split(" ")[1]);
			width = Integer.parseInt(tmp.split(" ")[2]);
			height = Integer.parseInt(tmp.split(" ")[3]);
			for (int j = 0; j < height; j++) {
				for (int k = 0; k < width; k++) {
					arr[y1][x1+k] = (i+1);
				}
				y1++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					cnts[arr[i][j]]++;
				}
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.println(cnts[i]);
		}
	}
}
