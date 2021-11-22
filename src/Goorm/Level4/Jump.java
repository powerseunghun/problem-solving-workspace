package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	public Pos() {
		this.x = 0;
		this.y = 0;
	}
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
public class Jump {
	static int count = 0;
	static int[][] arr = null;
	static boolean[][] check = null;
	static boolean validCheck(int x, int y) {
		if (x < 0 || y < 0 || x > arr.length-1 || y > arr[x].length-1) return false;
		return true;
	}
	static void bfs(int x, int y) {
		Queue<Pos> q = new LinkedList<>();
		
		q.add(new Pos(x, y));
		int nx = 0, ny = 0;
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr[tmp.getX()].length-1) {
				count++;
				continue;
			}
			
			check[tmp.getX()][tmp.getY()] = true;
			
			nx = tmp.getX() + arr[tmp.getX()][tmp.getY()];
			ny = tmp.getY() + arr[tmp.getX()][tmp.getY()];
			if (validCheck(tmp.getX(), ny) && !check[tmp.getX()][ny]) q.add(new Pos(tmp.getX(), ny));
			if (validCheck(nx, tmp.getY()) && !check[nx][tmp.getY()]) q.add(new Pos(nx, tmp.getY()));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		check = new boolean[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = tmp.split(" ")[j].charAt(0) - '0';
			}
		}
		
		bfs(0, 0);
		
		System.out.println(count);
		br.close();
	}
}
