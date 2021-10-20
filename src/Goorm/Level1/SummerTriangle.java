package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SummerTriangle {
	static double getDist(double x1, double y1, double x2, double y2) {
		double tmp = Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2);
		return Math.sqrt(tmp);
	}
	static double getS(double a, double b, double c) {
		return (a+b+c)/2.0;
	}
	static double getArea(double a, double b, double c, double s) {
		double tmp = ((s-a) * (s-b) * (s-c)) * s;
		return Math.sqrt(tmp);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int[] x = new int[3], y = new int[3];
		double[] dists = new double[3];
		double s = 0;
		
		for (int i = 0; i < 3; i++) {
			str = br.readLine();
			x[i] = Integer.parseInt(str.split(" ")[0]);
			y[i] = Integer.parseInt(str.split(" ")[1]);
		}
		dists[0] = getDist(x[0], y[0], x[1], y[1]);
		dists[1] = getDist(x[0], y[0], x[2], y[2]);
		dists[2] = getDist(x[1], y[1], x[2], y[2]);
		s = getS(dists[0], dists[1], dists[2]);
		
		System.out.printf("%.2f\n", getArea(dists[0], dists[1], dists[2], s));
	}
}
