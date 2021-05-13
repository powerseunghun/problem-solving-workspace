package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistMultiPoint1722 {
	static double getDist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] points = new int[n][2];
		double sum = 0;
		String tmp = null;
		for (int i = 0; i < points.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = Integer.parseInt(tmp.split(" ")[j]);
			}
		}
		for (int i = 0; i < points.length-1; i++) {
			sum += getDist(points[i][0], points[i][1], points[i+1][0], points[i+1][1]);
		}
		
		System.out.printf("%.2f", sum);
	}
}
