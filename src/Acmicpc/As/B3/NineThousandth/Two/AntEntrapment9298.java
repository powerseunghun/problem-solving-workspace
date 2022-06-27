package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntEntrapment9298 {
	static double x1 = 0, y1 = 0, x2 = 0, y2 = 0;
	static void init() {
		x1 = -1001;
		y1 = -1001;
		x2 = 1000;
		y2 = 1000;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0;
		
		double tx = 0, ty = 0, area = 0, peri = 0;
		String tmp = null;
		
		for (int i = 1; i <= t; i++) {
			sb.append("Case " + i + ": ");
			n = Integer.parseInt(br.readLine());
			init();
			for (int j = 0; j < n; j++) {
				tmp = br.readLine();
				tx = Double.parseDouble(tmp.split(" ")[0]);
				ty = Double.parseDouble(tmp.split(" ")[1]);
				x1 = Math.max(x1, tx);
				y1 = Math.max(y1, ty);
				x2 = Math.min(x2, tx);
				y2 = Math.min(y2, ty);
			}
			area = Math.abs((x1-x2)) * Math.abs((y1-y2));
			peri = (Math.abs((x1-x2)) + Math.abs((y1-y2)))*2;
			sb.append("Area " + area + ", Perimeter " + peri + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
