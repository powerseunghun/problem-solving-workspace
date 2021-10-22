package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WaveSensor {
	static double getDist(double X, double Y, double X2, double Y2) {
		double tmp = Math.pow(X-X2, 2) + Math.pow(Y-Y2, 2);
//		System.out.println("x-x2 : " + (X-X2));
//		System.out.println("y-y2 : " + (Y-Y2));
//		System.out.println("tmp : " + tmp);
		return Math.sqrt(tmp);
	}
	static boolean allCheck(boolean[] checks) {
		for (int i = 0; i < checks.length; i++) {
			if (!checks[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		double X = Double.parseDouble(tmp.split(" ")[0]), X2 = 0;
		double Y = Double.parseDouble(tmp.split(" ")[1]), Y2 = 0;
		double R = Double.parseDouble(tmp.split(" ")[2]), min = 0;
		double[] dists = new double[5];
		boolean[] checks = new boolean[5];
		
		for (int i = 0; i < dists.length; i++) {
			tmp = br.readLine();
			X2 = Double.parseDouble(tmp.split(" ")[0]);
			Y2 = Double.parseDouble(tmp.split(" ")[1]);
			dists[i] = getDist(X, Y, X2, Y2);
		}
		
		while (!allCheck(checks)) {
			min = Double.MAX_VALUE;
			for (int i = 0; i < dists.length; i++) {
				min = Math.min(dists[i], min);
			}
			for (int i = 0; i < dists.length; i++) {
				if (dists[i] == min) {
					checks[i] = true;
					if (R >= dists[i]) {
						System.out.println(i+1);
						return;
					}
					dists[i] = Double.MAX_VALUE;
				}
			}
		}
		System.out.println("-1");
	}
}
