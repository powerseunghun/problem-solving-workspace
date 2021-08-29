package Acmicpc.Geometry.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ladder2022 {
	static double inclination(double x, double y, double m) {
		double t1 = Math.sqrt(x*x - m*m);
		double t2 = Math.sqrt(y*y - m*m);
		
		return (t1*t2) / (t1+t2);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double x = Double.parseDouble(tmp.split(" ")[0]);
		double y = Double.parseDouble(tmp.split(" ")[1]);
		double c = Double.parseDouble(tmp.split(" ")[2]);
		double l = 0, r = Math.min(x, y), ans = 0, m = 0;
		
		while (r - l > 0.000001) {
			m = (l+r) / 2;
			
			if (inclination(x, y, m) >= c) {
				ans = m;
				l = m;
			}
			else r = m;
		}
		System.out.printf("%.3f\n", ans);
	}
}
