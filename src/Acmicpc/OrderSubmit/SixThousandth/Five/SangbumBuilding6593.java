package Acmicpc.OrderSubmit.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Pos {
	private int r;
	private int x;
	private int y;
	
	public Pos(int r, int x, int y) {
		this.r = r;
		this.x = x;
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
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
public class SangbumBuilding6593 {
	static int L = 0, R = 0, C = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static ArrayList<char[][]> list = new ArrayList<>();
	static boolean[][] check = null;
	static void init() {
		char[][] arr = null;
		for (int i = 0; i < L; i++) {
			arr = new char[R][C];
			list.add(arr);
		}
		check = new boolean[R][C];
	}
	static boolean checkDir(int x, int y) {
		if (x < 0 || y < 0 || x > (R-1) || y > (C-1)) return false;
		return true;
	}
	static boolean checkR(int l) {
		if (l < 0 || l > L-1) return false;
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		
		while (true) {
			tmp = br.readLine();
			L = Integer.parseInt(tmp.split(" ")[0]);
			R = Integer.parseInt(tmp.split(" ")[1]);
			C = Integer.parseInt(tmp.split(" ")[2]);
			if (L == 0 && R == 0 && C == 0) break;
			
			init();
			System.out.println("L : " + L + ", R : " + R + ", C : " + C);
			System.out.println("list size : " + list.size());
			for (int i = 0; i < L; i++) {
				for (int j = 0; j < R; j++) {
					tmp = br.readLine();
					for (int k = 0; k < C; k++) {
						list.get(i)[j][k] = tmp.charAt(k);
					}
				}
				
				
				for (int j = 0; j < list.get(i).length; j++) {
					for (int k = 0; k < list.get(i)[j].length; k++) {
						System.out.print(list.get(i)[j][k]);
					}
					System.out.println();
				}
				System.out.println();
				br.readLine();
			}
		}
	}
}
