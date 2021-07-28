package Acmicpc.DataStructure.FourThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LandCount4963 {
	static int[][] map = null;
	static int count = 0;
	static int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
	static void getCount(int x, int y) {
		if (x < 0 || y < 0 || x > map.length-1 || y > map[x].length-1) return;
		
		if (map[x][y] == 0) return;
		
		map[x][y] = 0;
		
		for (int i = 0; i < dirX.length; i++) {
			getCount(x+dirX[i], y+dirY[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int w = 0, h = 0;
		while (true) {
			tmp = br.readLine();
			count = 0;
			w = Integer.parseInt(tmp.split(" ")[0]);
			h = Integer.parseInt(tmp.split(" ")[1]);
			
			if (w == 0 && h == 0) break;
			map = new int[h][w];
			for (int i = 0; i < map.length; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < map[i].length; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			for (int i = 0; i < map.length; i++) {
				for (int j = 0; j < map[i].length; j++) {
					if (map[i][j] == 1) {
						getCount(i,j);
						count++;
					}
				}
			}
			sb.append(count+"\n");
		}
		System.out.print(sb.toString());
	}
}
