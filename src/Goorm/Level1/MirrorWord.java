package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MirrorWord {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		char[] c1 = {'b', 'i', 'l', 'm', 'n', 'o', 'p', 's', 'u', 'v', 'w', 'x'};
		char[] c2 = {'d', 'i', 'l', 'm', 'n', 'o', 'q', 'z', 'u', 'v', 'w', 'x'};
		for (int i = 0; i < c1.length; i++) {
			map.put(c1[i], c2[i]);
			map.put(c2[i], c1[i]);
		}
	}
	static boolean checkMirror(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (!map.containsKey(str.charAt(i))) {
				return false;
			}
			else if (map.get(str.charAt(i)) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		mapInit();
		for (int i = 0; i < N; i++) {
			if (checkMirror(br.readLine())) {
				sb.append("Mirror\n");
			}
			else sb.append("Normal\n");
		}
		System.out.println(sb.toString());
	}
}
