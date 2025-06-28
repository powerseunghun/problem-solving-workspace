package Acmicpc.As.B2.TwentyThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Ресторан23738 {
	static Map<Character, String> map = new HashMap<>();
	static void mapInit() {
		map.put('B', "v"); map.put('E', "ye"); map.put('H', "n"); map.put('P', "r");
		map.put('C', "s"); map.put('Y', "u"); map.put('X', "h");
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				sb.append(map.get(c));
			} else {
				sb.append((char)(c+32));
			}
		}
		
		System.out.println(sb.toString());
		br.close();
		
	}
}
