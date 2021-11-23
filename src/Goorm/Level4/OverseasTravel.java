package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Info {
	private int x;
	private int y;
	private int cost;
	public Info(int x, int y, int c) {
		this.x = x;
		this.y = y;
		this.cost = c;
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
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
public class OverseasTravel {
	static int[][] arr = null;
	static boolean[] check = null;
	static long min = Long.MAX_VALUE;
	static void bfs() {
		Queue<Info> q = new LinkedList<>();
		for (int i = 1; i < arr[1].length; i++) {
			if (arr[1][i] != 0) {
				q.add(new Info(1, i, arr[1][i]));
			}
		}
		
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			if (tmp.getY() == arr.length-1) {
				min = Math.min(min, tmp.getCost());
				continue;
			}
			check[tmp.getY()] = true;
			
			for (int i = 1; i < arr[tmp.getY()].length; i++) {
				if (arr[tmp.getY()][i] != 0 && !check[i]) {
					q.add(new Info(tmp.getY(), i, tmp.getCost() + arr[tmp.getY()][i]));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N+1][N+1];
		check = new boolean[N+1];
		
		for (int i = 0, A = 0, B = 0, W = 0; i < M; i++) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			W = Integer.parseInt(tmp.split(" ")[2]);
			arr[A][B] = arr[A][B] == 0 ? W : Math.min(arr[A][B], W);
		}
		
		bfs();
		System.out.println(min == Integer.MAX_VALUE ? "go home" : min);
		br.close();
	}
}
