package Acmicpc.Geometry.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Point {
	private long x;
	private long y;
	public Point(long x, long y) {
		this.x = x;
		this.y = y;
	}
	public long getX() {
		return this.x;
	}
	public long getY() {
		return this.y; 
	}
}
public class Square1485 {
	static Point[] ps = null;
	static long[] dist = new long[6];
	static long getLength(Point p1, Point p2) {
		double t1 = Math.pow(p1.getX()-p2.getX(), 2);
		double t2 = Math.pow(p1.getY()-p2.getY(), 2);
		return (long)(t1+t2);
	}
	static void makeDistList() {
		int idx = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = i+1; j < 4; j++) {
				dist[idx++] = getLength(ps[i], ps[j]);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		long x = 0, y = 0;
		boolean flag1 = false, flag2 = false;
		
		for (int i = 0; i < T; i++) {
			ps = new Point[4];
			for (int j = 0; j < 4; j++) {
				tmp = br.readLine();
				x = Long.parseLong(tmp.split(" ")[0]);
				y = Long.parseLong(tmp.split(" ")[1]);
				ps[j] = new Point(x, y);
			}
			makeDistList();
			Arrays.sort(dist);
			flag1 = dist[0] == dist[1] && dist[1] == dist[2] && dist[2] == dist[3];
			flag2 = dist[4] == dist[5];
			if (flag1 && flag2) sb.append("1\n");
			else sb.append("0\n");
		}
		System.out.print(sb.toString()); 
	}
}
