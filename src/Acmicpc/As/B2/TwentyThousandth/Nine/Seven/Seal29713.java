package Acmicpc.As.B2.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Seal29713 {
	static final String t = "BRONZESILVER";
	static Map<Character, Integer> map = new HashMap<>();
	static boolean check() {
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			if (!map.containsKey(c) || map.get(c) == 0) {
				return false;
			}
			map.put(c, map.get(c)-1);
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		while(check()) {
			res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
