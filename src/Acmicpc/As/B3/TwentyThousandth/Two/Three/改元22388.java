package Acmicpc.As.B3.TwentyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 改元22388 {
	static boolean check(int y, int m, int d) {
		return y * 1000 + m * 100 + d > 31430;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, g = null;
		int m = 0, y = 0, d = 0, cal = 0;
		
		while (true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			
			g = tmp.split(" ")[0];
			y = Integer.parseInt(tmp.split(" ")[1]);
			m = Integer.parseInt(tmp.split(" ")[2]);
			d = Integer.parseInt(tmp.split(" ")[3]);
			
			sb.append((check(y, m, d) ? "? " : g + " ") + (check(y, m, d) ? (y-30) : y) + " " + m + " " + d + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
