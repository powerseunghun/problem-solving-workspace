package Acmicpc.As.B3.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class OddEvenStrings25801 {
	static Map<Character, Integer> map = new HashMap<>();
	static int check() {
		int base = Integer.MAX_VALUE;
		for (Character c : map.keySet()) {
			if (base == Integer.MAX_VALUE) {
				base = map.get(c) % 2;
				continue;
			}
			if (base != map.get(c) % 2) {
				return 2;
			}
		}
		return base;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println(check() == 2 ? "0/1" : check());
		br.close();
	}
}
