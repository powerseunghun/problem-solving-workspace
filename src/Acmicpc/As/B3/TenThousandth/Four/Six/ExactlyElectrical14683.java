package Acmicpc.As.B3.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExactlyElectrical14683 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sx = Integer.parseInt(tmp.split(" ")[0]);
		int sy = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		int ex = Integer.parseInt(tmp.split(" ")[0]);
		int ey = Integer.parseInt(tmp.split(" ")[1]);
		int t = Integer.parseInt(br.readLine()), gap = 0;
		
		gap = Math.abs(sx-ex) + Math.abs(sy-ey);
		
		if (gap % 2 == 0) {
			if (t % 2 == 0) System.out.println("Y\n");
			else System.out.println("N\n");
		}
		else {
			if (t % 2 != 0) System.out.println("Y\n");
			else System.out.println("N\n");
		}
		
		br.close();
	}
}
