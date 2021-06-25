package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShelfLife4061 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y1 = Integer.parseInt(tmp.split(" ")[0]);
		int m1 = Integer.parseInt(tmp.split(" ")[1]);
		int d1 = Integer.parseInt(tmp.split(" ")[2]);
		int day1 = (y1 * 360) + (m1 * 30) + d1;
		
		tmp = br.readLine();
		int y2 = Integer.parseInt(tmp.split(" ")[0]);
		int m2 = Integer.parseInt(tmp.split(" ")[1]);
		int d2 = Integer.parseInt(tmp.split(" ")[2]);
		int day2 = (y2 * 360) + (m2 * 30) + d2;
		int py = 0, pm = 0, pd = 0;
		
		if (day1 == day2) {
			System.out.println("O");
			System.out.println("0 0 0");
		}
		else if (day1 > day2) {
			System.out.println("O");
			day1 -= day2;
			y1 = day1 / 360;
			day1 %= 360;
			m1 = day1 / 30;
			day1 %= 30;
			System.out.println(y1 + " " + m1 + " " + day1);
		}
		else {
			System.out.println("X");
			day2 -= day1;
			y2 = day2 / 360;
			day2 %= 360;
			m2 = day2 / 30;
			day2 %= 30;
			System.out.println(y2 + " " + m2 + " " + day2);
		}
	}
}
