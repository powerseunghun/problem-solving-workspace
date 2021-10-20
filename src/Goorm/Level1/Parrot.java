package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Parrot {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		char[] vowel = {'a', 'e', 'i', 'o', 'u'};
		for (int i = 0; i < vowel.length; i++) {
			map.put(vowel[i], 1);
			map.put((char)(vowel[i]-32), 1);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String res = null, tmp = null;
		mapInit();
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			res = "";
			for (int j = 0; j < tmp.length(); j++) {
				if (map.containsKey(tmp.charAt(j))) res += tmp.charAt(j);
			}
			sb.append((res.equals("") ? "???" : res) + "\n");
		}
		System.out.println(sb.toString());
	}
}
