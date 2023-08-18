package Acmicpc.As.B1.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MonsterTruck2897 {
	static final int resLength = 5;
	static int[] dirX = {0, 0, 1, 1};
	static int[] dirY = {0, 1, 0, 1};
	static int[] res = new int[resLength];
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int R = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		boolean flag = true;
		arr = new char[R][C];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0, tmp = 0; j < arr[i].length; j++, tmp = 0) {
				if (i >= R-1 || j >= C-1) continue;
				flag = true;
				for (int k = 0, x = 0, y = 0; k < dirX.length; k++) {
					x = i + dirX[k];
					y = j + dirY[k];
					if (arr[x][y] == '#') {
						flag = false;
					}
					if (arr[x][y] == 'X') {
						tmp++;
					}
				}
				if (!flag) continue;
				res[tmp]++;
			}
		}
		
		for (int el : res) {
			System.out.println(el);
		}
		br.close();
	}
}
