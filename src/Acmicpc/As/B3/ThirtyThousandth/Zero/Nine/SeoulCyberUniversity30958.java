package Acmicpc.As.B3.ThirtyThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SeoulCyberUniversity30958 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine().replaceAll("[^a-z]", "");
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
			max = Math.max(max, map.get(c));
		}
		
		System.out.println(max);
		br.close();
	}
}
