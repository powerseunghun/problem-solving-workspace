package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumericSystem {
	static Map<Integer, Character> map = new HashMap<>();
	static void mapInit() {
		int val = 0;
		for (char c = '0'; c <= '9'; c++) {
			map.put(val++, c);
		}
		for (char c = 'A'; c <= 'K'; c++) {
			map.put(val++, c);
		}
	}
	static String change(int n, int d) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(map.get(n%d));
			n/=d;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]);
		int d = Integer.parseInt(tmp.split(" ")[1]);
		mapInit();
		
		System.out.println(change(n, d));
	}
}
