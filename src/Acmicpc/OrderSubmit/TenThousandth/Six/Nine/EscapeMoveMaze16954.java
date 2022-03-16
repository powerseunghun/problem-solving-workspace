package Acmicpc.OrderSubmit.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
public class EscapeMoveMaze16954 {
	// 00 01 02
	// 10 11 12
	// 20 21 22
	static char[][] arr = new char[8][8];
	static int[] dirX = {-1, -1, -1, 0, 0, 0, 1, 1, 1};
	static int[] dirY = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
	static Queue<Pos> q = new LinkedList<>();
	static boolean flag = false;
	static void wallAdjust() {
		Arrays.fill(arr[7], '.');
		
		for (int i = 6; i >= 0; i--) {
			for (int j = 0; j < 8; j++) {
				if (arr[i][j] == '#') {
					arr[i+1][j] = '#';
					arr[i][j] = '.';
				}
			}
		}
	}
	static void bfs() {
		int qs = q.size();
		for (int i = 0; i < qs; i++) {
			if (flag) return;
			Pos tmp = q.poll();
			if (arr[tmp.getX()][tmp.getY()] == '#') continue;
			
			if (tmp.getX() == 0 && tmp.getY() == 7) {
				flag = true;
				return;
			}
			
			for (int j = 0, nx = 0, ny = 0; j < dirX.length; j++) {
				nx = tmp.getX() + dirX[j];
				ny = tmp.getY() + dirY[j];
				if (nx < 0 || ny < 0 || nx > 7 || ny > 7) continue;
				if (arr[nx][ny] == '.') {
					q.add(new Pos(nx, ny));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
			}
		}
		q.add(new Pos(7, 0));
		
		while (!q.isEmpty() && !flag) {
			bfs();
			wallAdjust();
		}
		
		System.out.println(flag ? 1 : 0);
		br.close();
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
	}
}
