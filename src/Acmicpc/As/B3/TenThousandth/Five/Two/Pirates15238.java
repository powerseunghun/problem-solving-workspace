package Acmicpc.As.B3.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Pirates15238 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		br.readLine();
		int max = 0;
		char maxChar = ' ', c = ' ';
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			if (map.get(c) > max) {
				maxChar = c;
				max = map.get(c);
			}
		}
		
		System.out.println(maxChar + " " + map.get(maxChar));
		br.close();
	}
}
