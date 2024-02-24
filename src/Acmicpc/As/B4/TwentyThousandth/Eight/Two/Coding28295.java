package Acmicpc.As.B4.TwentyThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coding28295 {
	static final int cnt = 10;
	static int d = 1080;
	static int[] weights = new int[] {0, 90, 180, -90};
	static char[] dirs = new char[]{'N', 'E', 'S', 'W'};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0, v = 0; i < cnt; i++) {
			v = Integer.parseInt(br.readLine());
			d += weights[v];
		}
		
		d /= 90;
		d %= 4;
		
		System.out.println(dirs[d]);
		br.close();
	}
}
