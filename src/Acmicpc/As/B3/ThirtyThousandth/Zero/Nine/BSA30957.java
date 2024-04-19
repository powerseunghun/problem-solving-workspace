package Acmicpc.As.B3.ThirtyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BSA30957 {
	static char[] arr = new char[]{'B', 'S', 'A'};
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = -1, maxCnt = 0;
		br.readLine();
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			max = Math.max(max, map.get(c));
		}
		
		for (int i = 0; i < arr.length; i++) {
			char c = arr[i];
			if (map.containsKey(c) && map.get(c) == max) {
				maxCnt++;
				sb.append(c);
			}
		}
		
		System.out.println(maxCnt == arr.length ? "SCU" : sb.toString());
		br.close();
	}
}
