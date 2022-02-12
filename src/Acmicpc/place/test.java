package Acmicpc.place;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Pos implements Comparable<Pos>{
	private int x;
	private int y;
	
	Pos (int x, int y) {
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
	@Override
	public int compareTo(Pos o) {
		return o.getX() - this.getX();
	}
}
public class test {
	static int count = 0;
	static int area = 0;
	static int maxArea = Integer.MIN_VALUE;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void search(int x, int y, int[][] arr) {
		arr[x][y] = 0;
		area++;
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (arr[nx][ny] == 1 && !check[nx][ny]) {
				search(nx, ny, arr);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Pos[] list = new Pos[10];
		int A = 0;
		for (int i = 0; i < list.length; i++) {
			A = (int)(Math.random()*10);
			list[i] = new Pos(A, 0);
		}
		PriorityQueue<Pos> pq = new PriorityQueue<>();
		
		for (int i = 0; i < list.length; i++) {
			pq.add(list[i]);
			System.out.print(list[i].getX() + " ");
		}
		while (!pq.isEmpty()) {
			System.out.println(pq.poll().getX());
		}
		br.close();
	}
}
