package Acmicpc.As.S5.TenThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pangram10384 {
	static Map<Character, Integer> map = new HashMap<>();
	static Map<Integer, String> numberMap = new HashMap<>();
	static char[] alps;
	static void init() {
		alps = new char['z'-'a'+1];
		for (char c = 'a'; c <= 'z'; c++) {
			alps[c-97] = c;
		}
		numberMap.put(1, "Pangram!");
		numberMap.put(2, "Double pangram!!");
		numberMap.put(3, "Triple pangram!!!");
	}
	static boolean check1() {
		for (int i = 0; i < alps.length; i++) {
			if (!map.containsKey(alps[i])) return false;
		}
		return true;
	}
	static int check2() {
		int res = 3;
		for (int el : map.values()) {
			res = Math.min(el, res);
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		init();
		
		for (int i = 1; i <= N; i++) {
			map.clear();
			str = br.readLine().replaceAll("[^a-z|^A-Z]", "").toLowerCase();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			sb.append("Case ").append(i).append(": ");
			if (!check1()) {
				sb.append("Not a pangram").append("\n");
			}
			else {
				int number = check2();
				sb.append(numberMap.get(number)).append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
