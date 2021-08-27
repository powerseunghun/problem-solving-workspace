package Acmicpc.NumberTheory.TwoThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

public class GeneralCommonDivisor2824 {
	static Map<Integer, Integer> mapA = new HashMap<>();
	static Map<Integer, Integer> mapB = new HashMap<>();
	static Set<Integer> list = new HashSet<>();
	static long gcd = 1;
	static void tokenToMap(StringTokenizer st, Map<Integer, Integer> map) {
		int val = 0, cnt = 0;
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			for (int j = 2; j*j <= val; j++) {
				cnt = 0;
				while (val % j == 0) {
					val /= j;
					cnt++;
				}
				if (map.containsKey(j)) map.put(j, map.get(j)+cnt);
				else map.put(j, cnt);
			}
			if (val > 1) {
				if (map.containsKey(val)) map.put(val, map.get(val)+1);
				else map.put(val, 1);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int power = 0, flag = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		tokenToMap(st, mapA);
		br.readLine();
		st = new StringTokenizer(br.readLine());
		tokenToMap(st, mapB);
		
		for (int k : mapA.keySet()) {
			if (!mapB.containsKey(k)) continue;
			power = Math.min(mapA.get(k), mapB.get(k));
			for (int i = 0; i < power; i++) {
				gcd *= k;
				if (gcd > 1000000000) {
					flag = 1;
					gcd %= 1000000000;
				}
			}
		}
		if (flag == 0) {
			System.out.println(gcd);
			return;
		}
		System.out.printf("%09d", gcd);
	}
}
