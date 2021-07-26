package Acmicpc.String.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NumericSystemChange2745 {
	static void mapInit(Map<Character, Integer> map) {
		for (char c = '0'; c <= '9'; c++) {
			map.put(c, c-'0');
		}
		for (int i = 10; i < 36; i++) {
			map.put((char)(i+55), i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		String s = tmp.split(" ")[0];
		int B = Integer.parseInt(tmp.split(" ")[1]), sum = 0, val = 0;
		Map<Character, Integer> map = new HashMap<>();
		mapInit(map);

		for (int i = s.length()-1, idx = 1; i >= 0; i--) {
			val = map.get(s.charAt(i));
			if (i == s.length()-1) {
				sum += val;
			}
			else sum += val * Math.pow(B, idx++);
		}
		System.out.println(sum);
	}
}
