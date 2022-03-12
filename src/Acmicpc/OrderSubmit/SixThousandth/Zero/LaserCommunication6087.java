package Acmicpc.OrderSubmit.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	private int l;
	private Pos prevPos;
	
	public Pos(int x, int y, int l, Pos prevPos) {
		this.x = x;
		this.y = y;
		this.l = l;
		this.prevPos = prevPos;
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
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public Pos getPrevPos() {
		return prevPos;
	}
	public void setPrevPos(Pos prevPos) {
		this.prevPos = prevPos;
	}
}
public class LaserCommunication6087 {
	static int laserX = 0, laserY = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static char[][] arr = null;
	static int[][] laser = null;
	static boolean[][] check = null;
	static int bfs() {
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(laserX, laserY, 0, null));
		check[laserX][laserY] = true;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (arr[tmp.getX()][tmp.getY()] == 'C' && tmp.getPrevPos() != null) {
				return tmp.getL();
			}
			
			for (int i = 0, nx = 0, ny = 0, l = tmp.getL(); i < dirX.length; i++, l = tmp.getL()) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == '*' || check[nx][ny]) continue;
				
				if (tmp.getPrevPos() != null) {
					int prevX = tmp.getPrevPos().getX();
					int prevY = tmp.getPrevPos().getY();
					if (Math.abs(prevX - nx) == 1 && Math.abs(prevY - ny) == 1) {
						l++;
					}
				}
				check[nx][ny] = true;
				q.add(new Pos(nx, ny, l, tmp));
			}
		}
		return 0;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int W = Integer.parseInt(tmp.split(" ")[0]);
		int H = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[H][W];
		check = new boolean[H][W];
		laser = new int[H][W];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == 'C') {
					laserX = laserX == 0 ? i : laserX;
					laserY = laserY == 0 ? j : laserY;
				}
			}
		}
		System.out.println(bfs());
		br.close();
//		for (char[] e : arr) {
//			for (char c : e) {
//				System.out.print(c);
//			}
//			System.out.println();
//		}
	}
}
