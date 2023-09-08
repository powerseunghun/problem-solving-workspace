package Acmicpc.As.B1.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordPuzzle9946 {
	static Map<Character, Integer> originMap = new HashMap<>();
	static Map<Character, Integer> collectMap = new HashMap<>();
	static boolean check(String origin, String collect) {
		char c = ' ';
		originMap.clear();
		collectMap.clear();
		for (int i = 0; i < origin.length(); i++) {
			c = origin.charAt(i);
			originMap.put(c, originMap.getOrDefault(c, 0)+1);
		}
		
		for (int i = 0; i < collect.length(); i++) {
			c = collect.charAt(i);
			collectMap.put(c, collectMap.getOrDefault(c, 0)+1);
		}
		
		for (char k : collectMap.keySet()) {
			if (!originMap.containsKey(k) || (originMap.get(k) != collectMap.get(k))) return false;
		}
		
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String origin = null, collect = null;
		int t = 1;
		
		while(true) { 
			origin = br.readLine();
			collect = br.readLine();
			
			if (origin.equals("END") && collect.equals("END")) break;
			sb.append("Case ").append(t++).append(": ")
			.append(check(origin, collect) ? "same" : "different").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
