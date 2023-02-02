package Acmicpc.As.B2.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cryptoquote2703 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit(String str) {
		map.clear();
		char b = 'A';
		for (int i = 0; i < str.length(); i++) {
			map.put(b++, str.charAt(i));
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			mapInit(br.readLine());
			for (int i = 0; i < str.length(); i++) {
				sb.append(map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) : str.charAt(i));
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
