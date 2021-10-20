package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumericSystemChange {
	static Map<Integer, Character> map = new HashMap<>();
	static void mapInit() {
		char c = '0';
		for (int i = 0; i < 10; i++) {
			map.put(i, c++);
		}
		c = 'A';
		for (int i = 10; i < 16; i++) {
			map.put(i, c++);
		}
	}
	static String change(int N, int d) {
		StringBuilder sb = new StringBuilder();
		while (N != 0) {
			sb.append(map.get(N%d));
			N /= d;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String str = input.split(" ")[1];
		int N = Integer.parseInt(input.split(" ")[0]), res = 0;
		mapInit();
		
		for (int i = 2; i <= 16; i++) {
			if (change(N, i).equals(str)) {
				res = i;
				break;
			}
		}
		System.out.println(res);
	}
}
