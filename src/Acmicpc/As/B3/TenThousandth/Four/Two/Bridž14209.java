package Acmicpc.As.B3.TenThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bridž14209 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put('A', 4);
		map.put('K', 3);
		map.put('Q', 2);
		map.put('J', 1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str = null;
		mapInit();
		
		while(N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (map.containsKey(c)) res += map.get(c);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
