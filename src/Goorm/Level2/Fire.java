package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	private int time;
	
	Pos() {}
	
	Pos(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.time = t;
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

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}
}
public class Fire {
	static char[][] arr = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int wonjunX = 0, wonjunY = 0;
	static boolean[][] check = null;
	static int goalTime = -1;
	
	static boolean validPos(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr.length-1) {
			return false;
		}
		return true;
	}
	static void bfs(Queue<Pos> q) {
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			check[tmp.getX()][tmp.getY()] = true;
			if (tmp.getX() == wonjunX && tmp.getY() == wonjunY) {
				goalTime = tmp.getTime()-1;
				break;
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (validPos(nx, ny) && !check[nx][ny] && arr[nx][ny] != '#') {
					q.add(new Pos(nx, ny, tmp.getTime()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		Queue<Pos> q = new LinkedList<>();
		
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[R][C];
		check = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			tmp = br.readLine();
			for (int j = 0; j < tmp.length(); j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == '@') {
					q.add(new Pos(i, j, 0));
				}
				else if (arr[i][j] == '&') {
					wonjunX = i;
					wonjunY = j;
				}
			}
		}
		bfs(q);
		
		System.out.println(goalTime);
	}
}
