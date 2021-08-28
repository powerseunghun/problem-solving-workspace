package Acmicpc.Geometry.TenThousandth.One.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCW11758 {
	static int CCW(int x1, int y1, int x2, int y2, int x3, int y3) {
		int t1 = x1 * y2 + x2 * y3 + x3 * y1;
		int t2 = x2 * y1 + x3 * y2 + x1 * y3;
		return t1-t2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ccw = 0;
		int[] ps = new int[6];
		String tmp = null;
		for (int i = 0, x = 0, y = 0, idx = 0; i < 3; i++, idx+=2) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			ps[idx] = x;
			ps[idx+1] = y;
		}
		ccw = CCW(ps[0], ps[1], ps[2], ps[3], ps[4], ps[5]);
		
		if (ccw == 0) {
			System.out.println("0");
		}
		else if (ccw > 0) {
			System.out.println("1");
		}
		else System.out.println("-1");
	}
}
