package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MirrorShape4583 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		char[] origins = {'b', 'd', 'p', 'q', 'i', 'o', 'v', 'w', 'x'};
		char[] targets = {'d', 'b', 'q', 'p', 'i', 'o', 'v', 'w', 'x'};
		for (int i = 0; i < origins.length; i++) {
			map.put(origins[i], targets[i]);
		}
	}
	static boolean check(String tmp) {
		for (int i = 0; i < tmp.length(); i++) {
			if (!map.keySet().contains(tmp.charAt(i))) return false;
		}
		return true;
	}
	static String func(String tmp) {
		StringBuilder sb = new StringBuilder();
		for (int i = tmp.length()-1; i >= 0; i--) {
			sb.append(map.get(tmp.charAt(i)));
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		mapInit();
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			
			sb.append(check(tmp) ? func(tmp) : "INVALID").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
