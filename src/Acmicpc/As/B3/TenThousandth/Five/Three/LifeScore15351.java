package Acmicpc.As.B3.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LifeScore15351 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int val = 1;
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(c, val++);
		}
	}
	static String func(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += map.get(str.charAt(i));
		}
		if (sum == 100) return "PERFECT LIFE";
		
		return sum + "";
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null;
		mapInit();
		
		while (N-- > 0) {
			str = br.readLine().replaceAll(" ", "");
			sb.append(func(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
