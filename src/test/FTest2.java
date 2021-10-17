package test;

import java.util.PriorityQueue;

class Pos implements Comparable<Pos> {
	private int x;
	private int y;
	private int sum;
	
	public Pos() {
		this.x = 0;
		this.y = 0;
		this.sum = 0;
	}
	public Pos(int x, int y, int sum) {
		this.x = x;
		this.y = y;
		this.sum = sum;
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
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	@Override
	public int compareTo(Pos o) {
		return this.sum - o.getSum();
	}
}
public class FTest2 {
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int[][] arr = {{9,3,9,9,9},{5,2,7,8,9},{8,1,5,8,9},{6,1,8,7,9},{9,9,8,9,9}};
	static boolean[][] check = new boolean[5][5];
	static boolean validCheck(int x, int y, int nx, int ny, int k) {
		if (nx == ny) return false;
		else if (!(Math.max(Math.abs(x-k), Math.abs(y-k)) <= Math.max(Math.abs(nx-k), Math.abs(ny-k)))) {
			System.out.println("vald2");
			return false;
		}
		
		return true;
	}
	static void bfs(int x, int y, int k) {
		PriorityQueue<Pos> q = new PriorityQueue<>();
		q.add(new Pos(x, y, 0));
		
		while(!q.isEmpty()) {
			Pos tmp = q.poll();
			System.out.println("tmp.getx : " + tmp.getX());
			System.out.println("tmp.getY : " + tmp.getY());
			if (tmp.getX() == 0 || tmp.getX() == arr.length-1) {
				System.out.println("END : " + tmp.getSum());
			}
			else if (tmp.getY() == 0 || tmp.getY() == arr.length-1) {
				System.out.println("END2 : " + tmp.getSum());
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = x + dirX[i];
				ny = y + dirY[i];
				if (validCheck(x, y, nx, ny, k)) {
					q.add(new Pos(nx, ny, tmp.getSum()+arr[nx][ny]));
				}
			}
		}
	}
	public static void main(String[] args) {
		int k = arr.length/2;
		bfs(k, k, k);
		System.out.println("END!!!");
	}
}
