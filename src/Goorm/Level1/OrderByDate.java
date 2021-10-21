package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

class DateInfo implements Comparable<DateInfo> {
	private int year;
	private int month;
	private int day;
	public DateInfo() {
		this.year = 0;
		this.month = 0;
		this.day = 0;
	}
	public DateInfo(int y, int m, int d) {
		if (y < 100) {
			this.year = y + 2000;
		}
		else this.year = y;
		this.month = m;
		this.day = d;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public int compareTo(DateInfo o) {
		if (this.getYear() == o.getYear()) {
			if (this.getMonth() == o.getMonth()) {
				return this.getDay() - o.getDay();
			}
			else return this.getMonth() - o.getMonth();
		}
		else return this.getYear() - o.getYear();
	}
}
public class OrderByDate {
	static Map<DateInfo, String> map = new HashMap<>();
	static String formatChange(String tmp) {
		String str = "";
		for (int i = 0; i < tmp.length(); i++) {
			switch(tmp.charAt(i)) {
			case '/': case '-': case '년': case '월':
				str += " ";
				break;
			default:
				if (tmp.charAt(i) >= '0' && tmp.charAt(i) <= '9') {
					str += tmp.charAt(i);
				}
				break;
			}
		}
		return str;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		String tmp = null;
		String[] strs = new String[3];
		DateInfo[] dates = new DateInfo[3];
		int year = 0, month = 0, day = 0;
		
		for (int i = 0; i < strs.length; i++) {
			strs[i] = br.readLine();
			st = new StringTokenizer(strs[i]);
			while (st.hasMoreTokens()) {
				tmp = st.nextToken();
				if (tmp.contains("/")) break;
				else if (tmp.contains("-")) break;
				else if (tmp.contains("년") && tmp.contains("월") && tmp.contains("일")) break;
			}
			st = new StringTokenizer(formatChange(tmp));
			
			year = Integer.parseInt(st.nextToken());
			month = Integer.parseInt(st.nextToken());
			day = Integer.parseInt(st.nextToken());
			dates[i] = new DateInfo(year, month, day);
			map.put(dates[i], strs[i]);
		}
		
		Arrays.sort(dates);
		for (int i = 0; i < dates.length; i++) {
			sb.append(map.get(dates[i]) + "\n");
		}
		System.out.print(sb.toString());
	}
}
