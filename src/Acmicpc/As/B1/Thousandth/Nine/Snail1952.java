package Acmicpc.As.B1.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
// 00 01 02
// 10 11 12
// 20 21 22
public class Snail1952 {
	static int[] dirX = { 0, 1, 0, -1 };
	static int[] dirY = { 1, 0, -1, 0 };
	static int[][] arr = null;
	static boolean[][] check = null;
	static class dir {
		public int x;
		public int y;
		
		dir(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<dir> q = new LinkedList<>();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), n = 0;
		int curX = 0, curY = 0, newX = 0, newY = 0, res = 0;
		arr = new int[N][M];
		check = new boolean[N][M];
		
		q.add(new dir(0, 0));
		check[0][0] = true;
		
		while (!q.isEmpty()) {
			dir d = q.poll();
			
			curX = d.x;
			curY = d.y;
			
			for (int i = 0; i < dirX.length / 2; i++) {
				n = (n+i) % dirX.length;
				
				newX = curX + dirX[n];
				newY = curY + dirY[n];
				if ((newX < 0 || newX >= N || newY < 0 || newY >= M) || (check[newX][newY])) continue;
				res = i == 1 ? res + 1 : res;
				
				check[newX][newY] = true;
				q.add(new dir(newX, newY));
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
