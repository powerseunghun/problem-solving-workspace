package CodeUp.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mathemagician2071 {
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
		for (int i = 1900; i < y; i++) {
			for (int j = 1; j <= 12; j++) {
				days += getDays(i, j);
			}
		}
		for (int i = 1; i < m; i++) {
			days += getDays(y, i);
		}
		days += d;
		
		return days % 7;
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int y = Integer.parseInt(tmp.split(" ")[1]);
		int m = Integer.parseInt(tmp.split(" ")[2]);
		int d = Integer.parseInt(tmp.split(" ")[3]);
		String[] day = new String[] {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		System.out.println("\"Mathemagic!\"");
		System.out.println(n * n);
		System.out.println(day[getTotalDays(y, m, d)]);
	}
}
