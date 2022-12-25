package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class H4x0r26768 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		char[] chs1 = {'a', 'e', 'i', 'o', 's'};
		char[] chs2 = {'4', '3', '1', '0', '5'};
		for (int i = 0; i < chs1.length; i++) {
			map.put(chs1[i], chs2[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		char c = ' ';
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			sb.append(map.containsKey(c) ? map.get(c) : c); 
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
