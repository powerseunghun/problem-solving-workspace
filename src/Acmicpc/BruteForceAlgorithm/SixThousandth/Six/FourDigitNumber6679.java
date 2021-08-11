package Acmicpc.BruteForceAlgorithm.SixThousandth.Six;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FourDigitNumber6679 {
	static boolean check(int N, String s2, String s3) {
		int val1 = 0, val2 = 0, val3 = 0;
		String s1 = N + "";
		for (int i = 0; i < s1.length(); i++) {
			val1 += getMap.get(s1.charAt(i));
		}
		for (int i = 0; i < s2.length(); i++) {
			val2 += getMap.get(s2.charAt(i));
		}
		for (int i = 0; i < s3.length(); i++) {
			val3 += getMap.get(s3.charAt(i));
		}
		return (val1 == val2) && (val2 == val3);
	}
	static void mapInit() {
		for (int i = 0; i < 10; i++) {
			map.put(i, (char)(i+48));
		}
		for (int i = 10; i < 16; i++) {
			map.put(i, (char)(i+55));
		}
		for (int i = 48; i <= 57; i++) {
			getMap.put((char)i, i-48);
		}
		int idx = 0;
		for (char c = 'A'; c <= 'F'; c++) {
			getMap.put(c, 10+(idx++));
		}
	}
	static Map<Integer, Character> map = new HashMap<>();
	static Map<Character, Integer> getMap = new HashMap<>();
	static String changeDigit(int d, int n) {
		StringBuilder sb = new StringBuilder();
		while (n != 0) {
			sb.append(map.get(n%d));
			n/=d;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		mapInit();
		
		for (int i = 1000; i <= 9999; i++) {
			if (check(i, changeDigit(12, i), changeDigit(16, i))) {
				sb.append(i+"\n");
			}
		}
		System.out.print(sb.toString());
	}
}
