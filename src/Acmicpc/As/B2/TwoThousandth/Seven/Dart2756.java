package Acmicpc.As.B2.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Dart2756 {
	static double getDist(double x, double y) {
		double res = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return res;
	}
	static int getScore(double dist) {
		int res = 100;
		double base = 3.0;
		
		for (int i = 0; i < 5; i++) {
			if (dist <= base + i*3.0) {
				return res;
			}
			res -= 20;
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), A = 0, B = 0;
		double x = 0, y = 0;
		StringTokenizer st = null;
		
		while(T-- > 0) {
			st = new StringTokenizer(br.readLine());
			A = 0;
			B = 0;
			for (int i = 0; i < 6; i++) {
				x = Double.parseDouble(st.nextToken());
				y = Double.parseDouble(st.nextToken());
				if (i < 3) {
					A += getScore(getDist(x, y));
				}
				else {
					B += getScore(getDist(x, y));
				}
			}
			sb.append("SCORE: " + A + " to " + B + ", " + (A==B ? "TIE." : (A>B ? "PLAYER 1 WINS." : "PLAYER 2 WINS."))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
