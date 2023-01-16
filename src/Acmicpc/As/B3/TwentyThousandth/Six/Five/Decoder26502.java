package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Decoder26502 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		char[] origins = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};
		char[] reps = {'y', 'a', 'e', 'i', 'o', 'u', 'Y', 'A', 'E', 'I', 'O', 'U'};
		for (int i = 0; i < reps.length; i++) {
			map.put(reps[i], origins[i]);
		}
	}
	static void func(StringBuilder sb, String str) {
		for (int i = 0; i < str.length(); i++) {
			sb.append(map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) : str.charAt(i));
		}
		sb.append("\n");
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		mapInit();
		
		while(n-- > 0) {
			func(sb, br.readLine());
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
