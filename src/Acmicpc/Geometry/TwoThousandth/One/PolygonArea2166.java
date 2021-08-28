package Acmicpc.Geometry.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
public class PolygonArea2166 {
	static long CCW(Point p1, Point p2, Point p3) {
		long t1 = p1.getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * p1.getY();
		long t2 = p2.getX() * p1.getY() + p3.getX() * p2.getY() + p1.getX() * p3.getY();
		return t1-t2;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		Point[] ps = new Point[N];
		long sum = 0, x = 0, y = 0;
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			x = Long.parseLong(tmp.split(" ")[0]);
			y = Long.parseLong(tmp.split(" ")[1]);
			ps[i] = new Point(x, y);
		}
		
		for (int i = 0; i < N-1; i++) {
			sum += CCW(ps[0], ps[i], ps[i+1]);
		}
		System.out.printf("%.1f", Math.abs(sum/2.0));
	}
}
