package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwPointerDistance {
	static double getDistance(int[] points) {
		double a = Math.pow(points[2] - points[0], 2);
		double b = Math.pow(points[3] - points[1], 2);
		
		return Math.sqrt(a+b);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] points = new int[4];
		String tmp = null;
		
		for (int i = 0; i < points.length; i+=2) {
			tmp = br.readLine();
			points[i] = Integer.parseInt(tmp.split(" ")[0]);
			points[i+1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		System.out.printf("%.2f", getDistance(points));
	}
}
