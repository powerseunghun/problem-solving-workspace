package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LifeGame1515 {
	public static void main(String[] args) throws IOException {
		int[][] arr = new int[27][27], arr2 = new int[27][27];
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
			Arrays.fill(arr2[i], 0);
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int count = 0;
		for (int i = 1; i <= 25; i++) {
			tmp = br.readLine();
			for (int j = 1; j <= 25; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				count = 0;
				if (arr[i-1][j-1] == 1) count++;
				if (arr[i-1][j] == 1) count++;
				if (arr[i-1][j+1] == 1) count++;
				if (arr[i][j-1] == 1) count++;
				if (arr[i][j+1] == 1) count++;
				if (arr[i+1][j-1] == 1) count++;
				if (arr[i+1][j] == 1) count++;
				if (arr[i+1][j+1] == 1) count++;
				
				switch(arr[i][j]) {
				case 0:
					if (count == 3) arr2[i][j] = 1;
					break;
				case 1:
					if (count >= 4 || count <= 1) arr2[i][j] = 0;
					else if (count == 2 || count == 3) arr2[i][j] = 1;
					break;
				}
			}
		}
		
		for (int i = 1; i < arr2.length-1; i++) {
			for (int j = 1; j < arr2[i].length-1; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
	}
}
