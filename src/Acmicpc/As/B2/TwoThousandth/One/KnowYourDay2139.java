package Acmicpc.As.B2.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class KnowYourDay2139 {
	static Map<Integer, Integer> map = new HashMap<>();
	static boolean checkLeafYear(int year) {
		return ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)); 
	}
	static void mapInit() {
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (int i = 0; i < d.length; i++) {
			map.put(i+1, d[i]);
		}
	}
	static int calc(int d, int m, int y) {
		int res = 0;
		for (int i = 1; i < m; i++) {
			res += i == 2 ? checkLeafYear(y) ? map.get(i)+1 : map.get(i) : map.get(i);
		}
		return res + d;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int d = 0, m = 0, y = 0;
		mapInit();
		
		while (true) {
			tmp = br.readLine();
			d = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			y = Integer.parseInt(tmp.split(" ")[2]);
			if (d == 0 && m == 0 && y == 0) break;
			sb.append(calc(d, m, y) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
