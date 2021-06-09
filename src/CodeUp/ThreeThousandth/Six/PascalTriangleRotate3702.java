package CodeUp.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PascalTriangleRotate3702 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int r = Integer.parseInt(tmp.split(" ")[0]);
		int c = Integer.parseInt(tmp.split(" ")[1]);
		long[][] arr = new long[50][50];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 || j == 0) arr[i][j] = 1;
				else {
					arr[i][j] = (arr[i][j-1] + arr[i-1][j]) % 100000000;
				}
			}
		}
		System.out.println(arr[r-1][c-1]);
	}
}
