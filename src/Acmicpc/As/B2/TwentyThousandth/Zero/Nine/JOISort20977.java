package Acmicpc.As.B2.TwentyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JOISort20977 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List<Character> list = new ArrayList<Character>(Arrays.asList('J', 'O', 'I'));
		br.readLine();
		String str = br.readLine();
		Map<Character, Integer> map = new HashMap<>();
		char c = ' ';
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (Character ch : list) {
			if (!map.containsKey(ch)) continue;
			for (int i = 0; i < map.get(ch); i++) {
				sb.append(ch);
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
