package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UOSPC30822 {
	static char[] arr = {'u','o','s','p','c'};
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		for (char c : arr) {
			map.put(c, 0);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = Integer.MAX_VALUE;
		br.readLine();
		String str = br.readLine();
		mapInit();
		
		for (int i = 0; i < str.length(); i++) {
			if (map.keySet().contains(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		
		for (Integer n : map.values()) {
			res = Math.min(n, res);
		}
		
		System.out.println(res);
		br.close();
	}
}
