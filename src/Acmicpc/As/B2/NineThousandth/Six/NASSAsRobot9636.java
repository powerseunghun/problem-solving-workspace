package Acmicpc.As.B2.NineThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NASSAsRobot9636 {
	static Map<Character, Integer> map = new HashMap<>();
	static int getter(char c) {
		return map.containsKey(c) ? map.get(c) : 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			map.clear();
			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				map.put(c, map.getOrDefault(c, 0)+1);
			}
			sb.append(getter('R')-getter('L')-getter('?')).append(" ");
			sb.append(getter('U')-getter('D')-getter('?')).append(" ");
			sb.append(getter('R')-getter('L')+getter('?')).append(" ");
			sb.append(getter('U')-getter('D')+getter('?')).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
