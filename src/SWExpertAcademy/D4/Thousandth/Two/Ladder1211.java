package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ladder1211 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int search(int x, int y) {
		int count = 0;
		while (true) {
			if (x == 99) break;
			count++;
			if (y-1 >= 0 && arr[x][y-1] == 1 && !check[x][y-1]) {
				check[x][y-1] = true;
				y--;
			}
			else if (y+1 < 100 && arr[x][y+1] == 1 && !check[x][y+1]) {
				check[x][y+1] = true;
				y++;
			}
			else {
				check[x+1][y] = true;
				x++;
			}
		}
		return count;
	}
	static void init() {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int x = 0, y = 0, min = 0, minIdx = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];
			check = new boolean[100][100];
			min = Integer.MAX_VALUE;
			x = 99;
			y = 0;
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0, val = 0; j < arr[0].length; j++) {
				init();
				check[0][j] = true;
				if (arr[0][j] == 1) {
					val = search(0, j);
					if (val < min) {
						min = val;
						minIdx = j;
					}
				}
			}
			sb.append("#" + i + " " + minIdx + "\n");
		}
		System.out.print(sb.toString());
	}
}
