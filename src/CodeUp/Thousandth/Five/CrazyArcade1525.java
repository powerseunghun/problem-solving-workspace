package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrazyArcade1525 {
	static void bang(int x, int y, int[][] arr) {
		int power = arr[x][y];
		arr[x][y] = -2;
		// 아래쪽 체크
		for (int i = 1; i <= power; i++) {
			if (((x+i) > 10) || (arr[x+i][y] == -1)) break;
			if (arr[x+i][y] > 0) continue;
			arr[x+i][y] = -2;
		}
		// 오른쪽 체크
		for (int i = 1; i <= power; i++) {
			if (((y+i) > 10) || (arr[x][y+i] == -1)) break;
			if (arr[x][y+i] > 0) continue;
			arr[x][y+i] = -2;
		}
		// 위쪽 체크
		for (int i = 1; i <= power; i++) {
			if (((x-i) < 1) || (arr[x-i][y] == -1)) break;
			if (arr[x-i][y] > 0) continue;
			arr[x-i][y] = -2;
		}
		// 왼쪽 체크
		for (int i = 1; i <= power; i++) {
			if (((y-i) < 1) || (arr[x][y-i] == -1)) break;
			if (arr[x][y-i] > 0) continue;
			arr[x][y-i] = -2;
		}
	}
	public static void main(String[] args) throws IOException {
		int[][] arr = new int[10+2][10+2];
		int n = 0, x = 0, y = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		sb.append("Character Information\n");
		
		for (int i = 1; i < arr.length-1; i++) {
			tmp = br.readLine();
			for (int j = 1; j < arr[i].length-1; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if (arr[i][j] > 0) {
					bang(i, j, arr);
				}
			}
		}
		n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			if (arr[x][y] == 0) {
				arr[x][y] = i;
				sb.append("player " + i + " survive\n");
			}
			else if (arr[x][y] == -2) {
				sb.append("player " + i + " dead\n");
			}
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(sb.toString());
	}
}
