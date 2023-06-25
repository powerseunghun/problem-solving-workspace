package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LetterCount15184 {
	static void mapInit(Map<Character, Integer> map) {
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(c, 0);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		String str = br.readLine().toUpperCase().replaceAll(" ", "").replaceAll("[^A-Z]", "");
		char c = ' ';
		int v = 0;
		
		mapInit(map);
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (char k : map.keySet()) {
			v = map.get(k);
			sb.append(k).append(" | ");
			for (int i = 0; i < v; i++) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
