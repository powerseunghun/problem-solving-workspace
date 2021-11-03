package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class GetDay {
	static Map<Integer, Integer> map = new HashMap<>();
	static int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static String[] nameOfDay = {"FRI", "SAT", "SUN", "MON", "THU", "WED", "THR"};
	static void mapInit() {
		for (int i = 1; i <= 12; i++) {
			map.put(i, day[i-1]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int m = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]), sum = 0;
		mapInit();
		
		if (map.get(m) < d) {
			System.out.println("ERROR");
			return;
		}
		
		for (int i = 1; i < m; i++) {
			sum += map.get(i);
		}
		sum += (d-1);
		System.out.println(nameOfDay[sum%7]);
	}
}
