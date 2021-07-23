package Acmicpc.MatheMatics.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KayingCalendar6064 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), M = 0, N = 0, x = 0, y = 0;
		int year = 1, tmpx = 1, tmpy = 1;
		boolean flag = false;
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			year = 1;
			tmpx = 1;
			tmpy = 1;
			flag = false;
			M = Integer.parseInt(tmp.split(" ")[0]);
			N = Integer.parseInt(tmp.split(" ")[1]);
			x = Integer.parseInt(tmp.split(" ")[2]);
			y = Integer.parseInt(tmp.split(" ")[3]);
			
			while (true) {
				year++;
				tmpx++;
				tmpy++;
				if (tmpx > M) tmpx = 1;
				if (tmpy > N) tmpy = 1;
				
				if (tmpx == x && tmpy == y) {
					flag = true;
					break;
				}
				if (tmpx == M && tmpy == N) break;
			}
			if (flag) System.out.println(year);
			else System.out.println(-1);
		}
	}
}
