package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AmusementPark4039 {
	static int[][] arr = null;
	static int count = 0;
	static void bt(int x, int y, int prevValue, int cnt, int n, int m, int dir) {
//		System.out.println("x : " + x + ", y : " + y + ", prevValue : " + prevValue + ", cnt : " + cnt + ", n : " + n + ", m : " + m);
		if (x < 0 || y < 0 || x == n || y == m) {
			return;
		}
		if (Math.abs(arr[x][y] - prevValue) > 1) {
			return;
		}
		
		if (x == (n-1) && y == (m-1)) {
			count = Math.min(count, cnt);
			return;
		}
		switch(dir) {
		// fisrt input
		case 0:
			bt(x-1, y, arr[x][y], cnt+1, n, m, 4);
			bt(x, y-1, arr[x][y], cnt+1, n, m, 2);
			bt(x, y+1, arr[x][y], cnt+1, n, m, 1);
			bt(x+1, y, arr[x][y], cnt+1, n, m, 3);
			break;
			// from left
		case 1:
			bt(x-1, y, arr[x][y], cnt+1, n, m, 4);
			bt(x, y+1, arr[x][y], cnt+1, n, m, 1);
			bt(x+1, y, arr[x][y], cnt+1, n, m, 3);
			break;
			// from right
		case 2:
			bt(x-1, y, arr[x][y], cnt+1, n, m, 4);
			bt(x, y-1, arr[x][y], cnt+1, n, m, 2);
			bt(x+1, y, arr[x][y], cnt+1, n, m, 3);
			break;
			// from up
		case 3:
			bt(x, y-1, arr[x][y], cnt+1, n, m, 2);
			bt(x, y+1, arr[x][y], cnt+1, n, m, 1);
			bt(x+1, y, arr[x][y], cnt+1, n, m, 3);
			break;
			// from bottom
		case 4:
			bt(x-1, y, arr[x][y], cnt+1, n, m, 4);
			bt(x, y-1, arr[x][y], cnt+1, n, m, 2);
			bt(x, y+1, arr[x][y], cnt+1, n, m, 1);
			break;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[n][m];
		count = (n+1) * (m+1);
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		
		bt(0, 0, arr[0][0], 1, n, m, 0);
		System.out.println(count);
	}
}
