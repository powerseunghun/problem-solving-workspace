package Acmicpc.As.B4.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ChessBeginner29725 {
	static Map<Character, Integer> map = new HashMap<>();
	static char[] m = {'K', 'P', 'N', 'B', 'R', 'Q'};
	static int[] w = {0, 1, 3, 3, 5, 9};
	static final int line = 8;
	static void mapInit() {
		for (int i = 0; i < m.length; i++) {
			map.put(m[i], w[i]);
		}
		for (int i = 0; i < m.length; i++) {
			map.put((char)(m[i]+32), w[i]*(-1));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int res = 0;
		mapInit();
		
		for (int i = 0; i < line; i++) {
			str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				res += map.containsKey(str.charAt(j)) ? map.get(str.charAt(j)) : 0;
			}
		}
		
		System.out.println(res);
		br.close();
		
	}
}
