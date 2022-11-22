package Acmicpc.As.B3.TwentyThousandth.Six.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HIARC26004 {
	static Set<Character> set = new HashSet<>();
	static Map<Character, Integer> map = new HashMap<>();
	static void setInit() {
		Character[] crs = {'H', 'I', 'A', 'R', 'C'};
		for (Character c : crs) {
			set.add(c);
			map.put(c, 0);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = Integer.MAX_VALUE;
		setInit();
		
		for (int i = 0; i < str.length(); i++) {
			if (set.contains(str.charAt(i))) {
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
			}
		}
		
		for (Character c : map.keySet()) {
			res = Math.min(res, map.get(c));
		}
		
		System.out.println(res);
		br.close();
	}
}
