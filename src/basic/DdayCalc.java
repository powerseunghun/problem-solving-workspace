package basic;

import java.util.Scanner;

public class DdayCalc {
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
	public int getTotalDays(DdayCalc dc, int y, int m, int d) {
		int days = 0;
		for (int i = 1; i < y; i++) {
			for (int j = 1; j <= 12; j++) {
				days += dc.getDays(i, j);
			}
		}
		for (int i = 1; i < m; i++) {
			days += dc.getDays(y, i);
		}
		days += d;
		
		return days;
	}
	public static void main(String[] args) {
		DdayCalc dc = new DdayCalc();
		Scanner sc = new Scanner(System.in);
		String baseYear = sc.next(), baseMonth = sc.next(), baseDate = sc.next();
		String goalYear = sc.next(), goalMonth = sc.next(), goalDate = sc.next();
		int baseDays = dc.getTotalDays(dc, Integer.parseInt(baseYear), Integer.parseInt(baseMonth), Integer.parseInt(baseDate));
		int goalDays = dc.getTotalDays(dc, Integer.parseInt(goalYear), Integer.parseInt(goalMonth), Integer.parseInt(goalDate));
		char sign = baseDays <= goalDays ? '-' : '+';
		String result = Math.abs(baseDays - goalDays) == 0 ? "day" : Math.abs(baseDays - goalDays) + "";
		
		System.out.println("D" + sign + result);
	}
}
