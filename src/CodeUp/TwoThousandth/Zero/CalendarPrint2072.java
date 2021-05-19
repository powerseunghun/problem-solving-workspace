package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CalendarPrint2072 {
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
	static int getTotalDays(int y, int m) {
		int days = 0;
		for (int i = 1900; i < y; i++) {
			for (int j = 1; j <= 12; j++) {
				days += getDays(i, j);
			}
		}
		for (int i = 1; i < m; i++) {
			days += getDays(y, i);
		}
		days += 1;
		
		return days % 7;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int y = Integer.parseInt(tmp.split(" ")[0]);
		int m = Integer.parseInt(tmp.split(" ")[1]);
		int days = getTotalDays(y, m), count = 0, print = 0;
		String[] day = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("CALENDAR " + y + " " + m);
		System.out.println("   S   M   T   W   T   F   S");
		for (int i = 0; i < days; i++) {
			System.out.print("    ");
			count++;
		}
		for (int i = 1; i <= getDays(y, m); i++) {
			if (i >= 10) {
				System.out.print("  " + i);
			}
			else {
				System.out.print("   " + i);
			}
			count++;
			if (i == 13) print = count;
			if (count == 7) {
				if (i != getDays(y, m)) 
					System.out.println();
				count = 0;
			}
		}
		System.out.println();
		
		if (print % 6 == 0) System.out.println("Oh my god!");
		else System.out.println(day[print - 1]);
	}
}
