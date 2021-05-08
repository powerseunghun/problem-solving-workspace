package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LifeGame1520 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]), b = Integer.parseInt(tmp.split(" ")[1]), count = 0;
		int[][] arr = new int[a+2][b+2], arr2 = new int[a+2][b+2];
		tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]), y = Integer.parseInt(tmp.split(" ")[1]), z = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 1; i < arr.length-1; i++) {
			tmp = br.readLine();
			for (int j = 1; j < arr[i].length-1; j++) {
				int t = Integer.parseInt(tmp.split(" ")[j-1]);
				arr[i][j] = t;
				arr2[i][j] = t;
			}
		}
		int k = Integer.parseInt(br.readLine());
		
		for (int g = 0; g < k; g++) {
			for (int i = 1; i < arr.length-1; i++) {
				for (int j = 1; j < arr[i].length-1; j++) {
					count = 0;
					
					if (arr[i][j-1] == 1) count++;
					if (arr[i][j+1] == 1) count++;
					if (arr[i-1][j] == 1) count++;
					if (arr[i+1][j] == 1) count++;
					if (arr[i-1][j-1] == 1) count++;
					if (arr[i-1][j+1] == 1) count++;
					if (arr[i+1][j-1] == 1) count++;
					if (arr[i+1][j+1] == 1) count++;
					
					if (arr[i][j] == 0) {
						if (count == x) arr2[i][j] = 1;
					}
					else {
						if (count < y || count >= z) arr2[i][j] = 0;
						else arr2[i][j] = 1;
					}
				}
			}
			for (int i = 1; i < arr.length-1; i++) {
				for (int j = 1; j < arr[i].length-1; j++) {
					arr[i][j] = arr2[i][j];
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
