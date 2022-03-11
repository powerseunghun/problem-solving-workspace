package Acmicpc.OrderSubmit.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail1913 {
	static int[][] arr = null;
	static void makeSnailArr() {
		int x = arr.length/2, y = arr.length/2, count = 1, value = 1;
		arr[x][y] = value++;
		while (true) {
			for (int i = 0; i < count; i++) {
				arr[--x][y] = value++;
				if (x == 0 && y == 0) return;
			}
			for (int i = 0; i < count; i++) {
				arr[x][++y] = value++;
			}
			count++;
			
			for (int i = 0; i < count; i++) {
				arr[++x][y] = value++;
			}
			for (int i = 0; i < count; i++) {
				arr[x][--y] = value++;
			}
			count ++;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int target = Integer.parseInt(br.readLine()), count = 1;
		int x = N/2, y = N/2, value = 1, targetX = 0, targetY = 0;
		
		arr = new int[N][N];
		makeSnailArr();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == target) {
					targetX = i+1;
					targetY = j+1;
				}
				sb.append(arr[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		System.out.println(targetX + " " + targetY);
		br.close();
	}
}
