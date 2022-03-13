package Acmicpc.OrderSubmit.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class King1063 {
	static char[][] arr = new char[8][8];
	static boolean valid(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) return false;
		return true;
	}
	static int[] dirX = {0, 0, 1, -1, -1, -1, 1, 1};
	static int[] dirY = {1, -1, 0, 0, 1, -1, 1, -1};
	static Map<String, Integer> map = new HashMap<>();
	static void init() {
		String[] strs = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], '.');
		}
		for (int i = 0; i < strs.length; i++) {
			map.put(strs[i], i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String k = tmp.split(" ")[0];
		String s = tmp.split(" ")[1];
		int N = Integer.parseInt(tmp.split(" ")[2]), kx = 0, ky = 0, sx = 0, sy = 0;
		init();
		kx = 8-(k.charAt(1)-'0');
		ky = k.charAt(0)-65;
		sx = 8-(s.charAt(1)-'0');
		sy = s.charAt(0)-65;
		arr[kx][ky] = 'K';
		arr[sx][sy] = 'S';
		
		for (int i = 0, nkx = 0, nky = 0, nsx = 0, nsy = 0, idx = 0; i < N; i++) {
			tmp = br.readLine();
			idx = map.get(tmp);
			nkx = kx + dirX[idx];
			nky = ky + dirY[idx];
			if (!valid(nkx, nky)) continue;
			
			if (arr[nkx][nky] == '.') {
				arr[nkx][nky] = 'K';
				arr[kx][ky] = '.';
				kx = nkx;
				ky = nky;
			}
			else if (arr[nkx][nky] == 'S') {
				nsx = sx + dirX[idx];
				nsy = sy + dirY[idx];
				if (!valid(nsx, nsy)) continue;
				if (arr[nsx][nsy] == '.') {
					arr[nsx][nsy] = 'S';
					arr[sx][sy] = '.';
					sx = nsx;
					sy = nsy;
					arr[nkx][nky] = 'K';
					arr[kx][ky] = '.';
					kx = nkx;
					ky = nky;
				}
			}
		}
		k = ((char)(ky + 65)+"") + ((8-kx) + "");
		s = ((char)(sy + 65)+"") + ((8-sx) + "");
		System.out.println(k);
		System.out.println(s);
		br.close();
	}
}
