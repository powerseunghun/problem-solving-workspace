package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestPath4083 {
	static double getDist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine()), flag = 0;
		int maxX1 = 0, maxY1 = 0, maxX2 = 0, maxY2 = 0;
		int[][] arr = new int[n][2];
		double maxDist = 0;
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			arr[i][0] = Integer.parseInt(tmp.split(" ")[0]);
			arr[i][1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				double dist = getDist(arr[i][0], arr[i][1], arr[j][0], arr[j][1]);
				if (dist > maxDist) {
					maxDist = dist;
					maxX1 = arr[i][0];
					maxY1 = arr[i][1];
					maxX2 = arr[j][0];
					maxY2 = arr[j][1];
				}
			}
		}
		System.out.printf("%.2f\n", maxDist);
		if (maxX1 > maxX2) flag = 0;
		else if (maxX1 == maxX2) {
			if (maxY1 > maxY2) flag = 0;
			else flag = 1;
		}
		else flag = 1;
		
		switch(flag) {
		case 0:
			System.out.println("(" + maxX1 + "," + maxY1 + ")");
			System.out.println("(" + maxX2 + "," + maxY2 + ")");
			break;
		case 1:
			System.out.println("(" + maxX2 + "," + maxY2 + ")");
			System.out.println("(" + maxX1 + "," + maxY1 + ")");
			break;
		}
	}
}
