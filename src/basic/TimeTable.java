package basic;

import java.util.Scanner;

public class TimeTable {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int h = 0, m = 0, std = 0, rest = 0, t = 0, lt = 0, ltime = 0;
		h = sc.nextInt(); m = sc.nextInt(); std = sc.nextInt(); rest = sc.nextInt();
		t = sc.nextInt(); lt = sc.nextInt(); ltime = sc.nextInt();
		
		int ah = 0, am = 0, tmp;
		for (int i = 1; i <= t; i++) {
			am = m + std;
			if (am >= 60) {
				tmp = (am / 60);
				am = am - tmp * 60;
				ah = h + tmp;
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
					tmp = (am / 60);
					am = am - tmp * 60;
					ah = h + tmp;
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
					tmp = (m / 60);
					m = m - (tmp * 60);
					h = h + tmp;
				}
			}
		}
	}
}
