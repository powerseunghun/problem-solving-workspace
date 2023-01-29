package Acmicpc.As.B2.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class LetterCookies11117 {
	static Map<Character, Integer> map = new HashMap<>();
	static boolean func(String tmp) {
		Map<Character, Integer> cMap = new HashMap<>();
		for (Character c : map.keySet()) {
			cMap.put(c, map.get(c));
		}
		for (int i = 0; i < tmp.length(); i++) {
			if (cMap.get(tmp.charAt(i)) == 0) return false;
			else cMap.put(tmp.charAt(i), cMap.get(tmp.charAt(i))-1);
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), W = 0;
		
		while(T-- > 0) {
			map.clear();
			for (char c = 'A'; c <= 'Z'; c++) {
				map.put(c, 0);
			}
			tmp = br.readLine();
			for (int i = 0; i < tmp.length(); i++) {
				map.put(tmp.charAt(i), map.getOrDefault(tmp.charAt(i), 0)+1);
			}
			
			W = Integer.parseInt(br.readLine());
			while(W-- > 0) {
				tmp = br.readLine();
				sb.append(func(tmp) ? "YES\n" : "NO\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
