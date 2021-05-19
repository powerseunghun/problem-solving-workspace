package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DdayCalc2080 {
	static int getDays(int year, int month) {
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
	static int getTotalDays(int y, int m, int d) {
		int days = 0;
		for (int i = 1; i < y; i++) {
			for (int j = 1; j <= 12; j++) {
				days += getDays(i, j);
			}
		}
		for (int i = 1; i < m; i++) {
			days += getDays(y, i);
		}
		days += d;
		
		return days;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String baseYear = tmp.split(" ")[0], baseMonth = tmp.split(" ")[1], baseDate = tmp.split(" ")[2];
		tmp = br.readLine();
		String goalYear = tmp.split(" ")[0], goalMonth = tmp.split(" ")[1], goalDate = tmp.split(" ")[2];
		int baseDays = getTotalDays(Integer.parseInt(baseYear), Integer.parseInt(baseMonth), Integer.parseInt(baseDate));
		int goalDays = getTotalDays(Integer.parseInt(goalYear), Integer.parseInt(goalMonth), Integer.parseInt(goalDate));
		char sign = baseDays <= goalDays ? '-' : '+';
		String result = Math.abs(baseDays - goalDays) == 0 ? "day" : Math.abs(baseDays - goalDays) + "";
		
		System.out.println("D" + sign + result);
	}
}
