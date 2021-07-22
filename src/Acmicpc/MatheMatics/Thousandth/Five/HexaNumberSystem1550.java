package Acmicpc.MatheMatics.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HexaNumberSystem1550 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		for (int i = 0; i < 16; i++) {
			if (i < 10) {
				map.put((char)(48+i), i);
			}
			else map.put((char)(55+i), i);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int sum = 0;
		mapInit();
		for (int i = tmp.length()-1, val = 0, w = 0; i >= 0; i--, w++) {
			val = map.get(tmp.charAt(i));
			sum += w == 0 ? val : Math.pow(16, w) * val;
		}
		System.out.println(sum);
	}
}
