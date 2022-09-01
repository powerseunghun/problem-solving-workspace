package Acmicpc.As.B3.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WookJeking15923 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), bx = 0, by = 0, x = 0, y = 0, res = 0;
		String tmp = br.readLine();
		bx = Integer.parseInt(tmp.split(" ")[0]);
		by = Integer.parseInt(tmp.split(" ")[1]);
		x = bx;
		y = by;
		
		for (int i = 0, curX = 0, curY = 0; i < N-1; i++) {
			tmp = br.readLine();
			curX = Integer.parseInt(tmp.split(" ")[0]);
			curY = Integer.parseInt(tmp.split(" ")[1]);
			res += Math.abs(curX+curY-x-y);
			x = curX;
			y = curY;
		}
		res += Math.abs(x+y-bx-by);
		
		System.out.println(res);
		br.close();
	}
}
