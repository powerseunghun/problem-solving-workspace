package Goorm.Level1;

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
	public static void main(String[] args) {
		int[] x = {-7, 0, 8};
		int[] y = {-4, -9, 8};
		double a = getDist(x[0], y[0], x[1], y[1]);
		double b = getDist(x[1], y[1], x[2], y[2]);
		double c = getDist(x[0], y[0], x[2], y[2]);
		double s = getS(a, b, c);
		
		System.out.printf("%.2f\n", getArea(a, b, c, s));
	}
}
