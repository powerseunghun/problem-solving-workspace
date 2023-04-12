package Acmicpc.As.B2.SevenThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount7600 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> map = new HashMap<>();
		String str = null;
		
		while(true) {
			str = br.readLine().replaceAll(" ", "").toUpperCase();
			if (str.equals("#")) break;
			map.clear();
			
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
					map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
				}
			}
			sb.append(map.keySet().size()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
