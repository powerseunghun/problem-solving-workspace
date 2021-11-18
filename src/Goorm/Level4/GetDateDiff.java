package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetDateDiff {
	static boolean checkLeafYear(int year) {
		return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)); 
	}
	static void mapInit(Map<Integer, Integer> map) {
		map.put(1, 31); map.put(2, 28); map.put(3, 31); map.put(4, 30);
		map.put(5, 31); map.put(6, 30); map.put(7, 31); map.put(8, 31);
		map.put(9, 30); map.put(10, 31); map.put(11, 30); map.put(12, 31);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		String tmp = br.readLine();
		int diff = Integer.parseInt(tmp.split(" ")[0]), month = Integer.parseInt(tmp.split(" ")[1]), day = 0;
		int date1 = Integer.min(diff, month);
		int date2 = Integer.max(diff, month);
		mapInit(map);
		
		diff = 0;
		while (date1 != date2) {
			diff++; date1++;
			month = date1 % 10000 / 100;
			day = date1 % 100;
			
			if (month == 2 && checkLeafYear(date1 / 10000)) {
				if (day > map.get(month)+1) {
					date1 += 100;
					date1 = date1 / 100 * 100 + 1;
				}
			}
			else {
				if (day > map.get(month)) {
					date1 += 100;
					date1 = date1 / 100 * 100 + 1;
					month = date1 % 10000 / 100;
					if (month > 12) {
						date1 += 10000;
						date1 = date1 / 10000 * 100 + 1;
						date1 = date1 * 100 + 1;
					}
				}
			}
		}
		System.out.println(diff);
		br.close();
	}
}
