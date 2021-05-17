package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeTable2039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h = 0, m = 0, std = 0, rest = 0, t = 0, lt = 0, ltime = 0;
		String tmp = br.readLine();
		h = Integer.parseInt(tmp.split(" ")[0]);
		m = Integer.parseInt(tmp.split(" ")[1]);
		std = Integer.parseInt(tmp.split(" ")[2]);
		rest = Integer.parseInt(tmp.split(" ")[3]);
		t = Integer.parseInt(tmp.split(" ")[4]);
		lt = Integer.parseInt(tmp.split(" ")[5]);
		ltime = Integer.parseInt(tmp.split(" ")[6]);
		
		int ah = 0, am = 0;
		for (int i = 1; i <= t; i++) {
			am = m + std;
			if (am >= 60) {
				am -= 60;
				ah = h + 1;
			}
			else {
				ah = h;
			}
			System.out.printf("%d:%02d-%d:%02d %d교시\n", h, m, ah, am, i);
			h = ah;
			m = am;
			if (i == lt) {
				am += ltime;
				if (am >= 60) {
					am -= 60;
					ah = ah + 1;
				}
				else {
					ah = h;
				}
				System.out.printf("%d:%02d-%d:%02d 점심시간\n", h, m, ah, am);
				h = ah;
				m = am;
			}
			else {
				h = ah;
				m = am;
				m += rest;
				if (m >= 60) {
					m -= 60;
					h = h + 1;
				}
			}
		}
	}
}
