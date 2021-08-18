package Acmicpc.Sorting.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Point implements Comparable<Point>{
	private int x;
	private int color;
	public Point(int x, int c) {
		this.x = x;
		this.color = c;
	}
	public int getX() {
		return this.x;
	}
	public int getColor() {
		return this.color;
	}
	@Override
	public int compareTo(Point o) {
		if (this.getColor() == o.getColor()) {
			return this.x - o.getX();
		}
		else return this.getColor() - o.getColor();
	}
}
public class DrawArrow15975 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine()), sum = 0;
		Point[] ps = new Point[N];
		for (int i = 0, x = 0, c = 0; i < N; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			c = Integer.parseInt(tmp.split(" ")[1]);
			ps[i] = new Point(x, c);
		}
		Arrays.sort(ps);
		
		for (int i = 0; i < ps.length; i++) {
			if (i == 0) {
				if (ps[i].getColor() == ps[i+1].getColor()) {
					sum += Math.abs(ps[i+1].getX() - ps[i].getX());
				}
			}
			else if (i == ps.length-1) {
				if (ps[i].getColor() == ps[i-1].getColor()) {
					sum += Math.abs(ps[i].getX() - ps[i-1].getX());
				}
			}
			else {
				if(ps[i].getColor() == ps[i-1].getColor() && ps[i].getColor() == ps[i+1].getColor()) {
					sum += Math.min(Math.abs(ps[i].getX() - ps[i-1].getX()), Math.abs(ps[i+1].getX() - ps[i].getX()));
				}
				else if (ps[i].getColor() == ps[i-1].getColor() && ps[i].getColor() != ps[i+1].getColor()) {
					sum += Math.abs(ps[i].getX() - ps[i-1].getX());
				}
			}
		}
		System.out.println(sum);
	}
}
