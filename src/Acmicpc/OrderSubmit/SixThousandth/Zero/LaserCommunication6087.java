package Acmicpc.OrderSubmit.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
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
	static int bfs() {
		int res = Integer.MAX_VALUE;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(laserX, laserY, 0, null));
		laser[laserX][laserY] = 0;
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			if (arr[tmp.getX()][tmp.getY()] == 'C' && tmp.getPrevPos() != null) {
				res = Math.min(res, tmp.getL());
			}
			
			for (int i = 0, nx = 0, ny = 0, l = tmp.getL(); i < dirX.length; i++, l = tmp.getL()) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == '*' || laser[nx][ny] <= l) continue;
				
				if (tmp.getPrevPos() != null) {
					int prevX = tmp.getPrevPos().getX();
					int prevY = tmp.getPrevPos().getY();
					if (Math.abs(prevX - nx) == 1 && Math.abs(prevY - ny) == 1) {
						l++;
					}
				}
//				System.out.println("nx : " + nx + ", ny : " + ny + ", l : " + l);
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				laser[nx][ny] = Math.min(laser[nx][ny], l);
				q.add(new Pos(nx, ny, l, tmp));
			}
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		boolean posFlag = false;
		int W = Integer.parseInt(tmp.split(" ")[0]);
		int H = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[H][W];
		laser = new int[H][W];
		
		for (int i = 0; i < laser.length; i++) {
			Arrays.fill(laser[i], Integer.MAX_VALUE);
		}
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == 'C' && !posFlag) {
					laserX = i;
					laserY = j;
					posFlag = true;
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
