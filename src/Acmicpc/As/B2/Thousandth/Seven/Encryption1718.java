package Acmicpc.As.B2.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map; 

public class Encryption1718 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		int w = 1;
		for (char c = 'a'; c <= 'z'; c++) {
			map.put(c, w++);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine(), p = br.readLine();
		mapInit();
		
		for (int i = 0, v = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				sb.append(str.charAt(i));
				continue;
			}
			v = str.charAt(i) - map.get(p.charAt(i % p.length()));
			v = v < 97 ? v+26 : v;
			sb.append((char)v);
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
