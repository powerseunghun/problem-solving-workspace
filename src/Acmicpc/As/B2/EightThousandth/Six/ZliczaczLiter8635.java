package Acmicpc.As.B2.EightThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ZliczaczLiter8635 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c == ' ') continue;
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		
		for (char c = 'a'; c <= 'z'; c++) {
			if (map.containsKey(c)) {
				sb.append(c).append(" ").append(map.get(c)).append("\n");
			}
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (map.containsKey(c)) {
				sb.append(c).append(" ").append(map.get(c)).append("\n");
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
