package basic;

import java.util.Scanner;

public class MatheMagician {
	public int getDays(int year, int month) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 !=0)) || year % 400 == 0;
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11) {
			return 30;
		}
		else {
			if (isLeapYear) return 29;
			else return 28;
		}
	}
	public int getTotalDays(MatheMagician mc, int y, int m, int d) {
		int days = 0;
		for (int i = 1900; i < y; i++) {
			for (int j = 1; j <= 12; j++) {
				days += mc.getDays(i, j);
			}
		}
		for (int i = 1; i < m; i++) {
			days += mc.getDays(y, i);
		}
		days += d;
		
		return days % 7;
	}
	public static void main(String[] args) {
		MatheMagician mc = new MatheMagician();
		Scanner sc = new Scanner(System.in);
		int days = 0;
		int n = sc.nextInt(), y = sc.nextInt(), m = sc.nextInt(), d = sc.nextInt();
		String[] day = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("\"Mathemagic!\"");
		System.out.println(n * n);
		System.out.println(day[mc.getTotalDays(mc, y, m, d)]);
	}
}
