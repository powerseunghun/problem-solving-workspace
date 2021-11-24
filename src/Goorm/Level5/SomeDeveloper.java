package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SomeDeveloper {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int val = 0;
		for (char c = '0'; c <= '9'; c++) {
			map.put(c, val++);
		}
		for (char c = 'A'; c <= 'F'; c++) {
			map.put(c, val++);
		}
	}
	static int change(String str, int d) {
		int n = 0, w = 0;
		for (int i = 0; i < str.length(); i++) {
			if (map.get(str.charAt(i)) >= d) return -1;
		}
		
		for (int i = str.length()-1; i >= 0; i--) {
			n += map.get(str.charAt(i)) * Math.pow(d, w++);
		}
		return n;
	}
	static boolean check(int n) {
		if (Math.sqrt(n) == (int)Math.sqrt(n)) return true;
		else return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		mapInit();
		
		for (int i = 1; ; i++) {
			if (check(change(N+"", i))) {
				System.out.println(i);
				break;
			}
		}
		br.close();
	}
}
