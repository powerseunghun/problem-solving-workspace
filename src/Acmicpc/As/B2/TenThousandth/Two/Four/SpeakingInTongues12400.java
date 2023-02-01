package Acmicpc.As.B2.TenThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SpeakingInTongues12400 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		String strs1[] = {"ejp mysljylc kd kxveddknmc re jsicpdrysi",
				"rbcpc ypc rtcsra dkh wyfrepkym veddknkmkrkcd", 
				"de kr kd eoya kw aej tysr re ujdr lkgc jv", "qz"};
		String strs2[] = {"our language is impossible to understand",
				"there are twenty six factorial possibilities", 
		"so it is okay if you want to just give up", "zq"};
		
		for (int i = 0; i < strs1.length; i++) {
			for (int j = 0; j < strs1[i].length(); j++) {
				map.put(strs1[i].charAt(j), strs2[i].charAt(j));
			}
		}
	}
	static String parse(String str) {
		StringBuilder sb = new StringBuilder();
		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			sb.append(map.containsKey(c) ? map.get(c) : c);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		mapInit();
//		for (Character c : map.keySet()) {
//			System.out.println(c + " " + map.get(c));
//		}
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			sb.append("Case #" + i + ": " + parse(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
