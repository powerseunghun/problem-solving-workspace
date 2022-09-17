package Acmicpc.As.B3.TwentyThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class YoenGil20540 {
	static Map<Character, Character> map = new HashMap<>();
	static void mapInit() {
		String mbti1 = "ESTJ";
		String mbti2 = "INFP";
		for (int i = 0; i < mbti1.length(); i++) {
			map.put(mbti1.charAt(i), mbti2.charAt(i));
			map.put(mbti2.charAt(i), mbti1.charAt(i));
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String mbti = br.readLine();
		
		mapInit();
		for (int i = 0; i < mbti.length(); i++) {
			sb.append(map.get(mbti.charAt(i)));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
