package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ladder1210 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int search(int x, int y) {
		while (x > 0) {
			if (y-1 >= 0 && arr[x][y-1] == 1 && !check[x][y-1]) {
				check[x][y-1] = true;
				y--;
			}
			else if (y+1 < 100 && arr[x][y+1] == 1 && !check[x][y+1]) {
				check[x][y+1] = true;
				y++;
			}
			else {
				check[x-1][y] = true;
				x--;
			}
		}
		return y;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int val = 0, x = 0, y = 0;
		
		for (int i = 1; i <= 10; i++) {
			br.readLine();
			arr = new int[100][100];
			check = new boolean[100][100];
			x = 99;
			y = 0;
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < arr[j].length; k++) {
					val = Integer.parseInt(st.nextToken());
					if (val == 2) y = k;
					arr[j][k] = val;
				}
			}
			check[x][y] = true;
			sb.append("#" + i + " " + search(x,y) + "\n");
		}
		System.out.print(sb.toString());
	}
}
