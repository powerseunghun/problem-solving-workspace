package Acmicpc.As.B2.TenThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Holes13772 {
	static Map<Character, Integer> map = new HashMap<>();
	static void mapInit() {
		map.put('A', 1); map.put('B', 2); map.put('D', 1); map.put('O', 1);
		map.put('P', 1); map.put('Q', 1); map.put('R', 1);
	}
	static int func(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			res += map.containsKey(str.charAt(i)) ? map.get(str.charAt(i)) : 0;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		mapInit();
		while(T-- > 0) {
			str = br.readLine();
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
