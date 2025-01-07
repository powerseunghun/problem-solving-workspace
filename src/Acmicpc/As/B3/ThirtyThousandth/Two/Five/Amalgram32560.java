package Acmicpc.As.B3.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Amalgram32560 {
	static Map<Character, Integer> mapInit(String str) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		return map;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str1 = br.readLine();
		String str2 = br.readLine();
		Map<Character, Integer> map1 = mapInit(str1);
		Map<Character, Integer> map2 = mapInit(str2);
		
		for (char c = 'a'; c <= 'z'; c++) {
			int i1 = map1.getOrDefault(c, 0);
			int i2 = map2.getOrDefault(c, 0);
			for (int i = 0; i < Math.max(i1, i2); i++) {
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
