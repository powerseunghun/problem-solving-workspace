package Acmicpc.As.B2.ThreeThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Dates3183 {
	static Map<Integer, Integer> map = new HashMap<>();
	static boolean isLeafYear(int year) {
		return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)); 
	}
	static void mapInit() {
		for (int i = 1; i <= 12; i++) {
			switch(i) {
			case 4: case 6: case 9: case 11:
				map.put(i, 30);
				break;
			case 2:
				map.put(i, 28);
				break;
			default:
				map.put(i, 31);
				break;
			}
		}
	}
	static boolean check(int y, int m, int d) {
		if (y == 0 || m == 0 || d == 0) return false;
		if (!(m >= 1 && m <= 12)) return false;
		if (!(d >= 1 && d <= 31)) return false;
 		if (m == 2) {
			if (isLeafYear(y)) {
				return d <= 29;
			}
			else {
				return d <= map.get(m);
			}
		}
		else {
			return d <= map.get(m);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		int y = 0, m = 0, d = 0;
		
		mapInit();
		while(true) {
			str = br.readLine();
			y = Integer.parseInt(str.split(" ")[2]);
			m = Integer.parseInt(str.split(" ")[1]);
			d = Integer.parseInt(str.split(" ")[0]);
			if (y == 0 && m == 0 && d == 0) break;
	
			sb.append(check(y, m, d) ? "Valid" : "Invalid").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
