package Codeforce.OrderSubmit.OneThousandth.TwoHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class AmusingJoke {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 2; i++) {
			sb.append(br.readLine());
		}
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < sb.toString().length(); i++) {
			char c = sb.toString().charAt(i);
			if (map.containsKey(c)) {
				if (map.get(c) == 1) map.remove(c);
				else map.put(c, map.get(c)-1);
				continue;
			}
			System.out.println("NO");
			return;
		}
		
		System.out.println(map.size() == 0 ? "YES" : "NO");
		br.close();
	}
}
