package Acmicpc.As.B3.TwentyThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class EasyToPronounceWords25785 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		for (char c = 'a'; c <= 'z'; c++) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				map.put(c, 1);
			}
			else map.put(c, 0);
		}
	}
	static int func(String str) {
		int base = map.get(str.charAt(0));
		for (int i = 1; i < str.length(); i++) {
			if (map.get(str.charAt(i)) == base) return 0;
			base = base == 0 ? 1 : 0;
		}
		return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		mapInit();
		
		System.out.println(func(str));
		br.close();
	}
}
