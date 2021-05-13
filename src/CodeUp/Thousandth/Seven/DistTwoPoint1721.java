package CodeUp.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DistTwoPoint1721 {
	static double getDist(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int x1 = Integer.parseInt(tmp.split(" ")[0]);
		int y1 = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		int x2 = Integer.parseInt(tmp.split(" ")[0]);
		int y2 = Integer.parseInt(tmp.split(" ")[1]);
		
		System.out.printf("%.2f", getDist(x1, y1, x2, y2));
	}
}
