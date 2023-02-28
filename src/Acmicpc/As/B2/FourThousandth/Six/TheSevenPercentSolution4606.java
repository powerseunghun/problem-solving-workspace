package Acmicpc.As.B2.FourThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TheSevenPercentSolution4606 {
	static Map<Character, String> map = new HashMap<>();
	static void mapInit() {
		char[] cs = {' ', '!', '$', '%', '(', ')', '*'};
		String[] reps = {"%20", "%21", "%24", "%25", "%28", "%29" ,"%2a"};
		for (int i = 0; i < Math.min(cs.length, reps.length); i++) {
			map.put(cs[i], reps[i]);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		char c = ' ';
		mapInit();
		
		while(true) {
			tmp = br.readLine();
			if (tmp.equals("#")) break;
			for (int i = 0; i < tmp.length(); i++) {
				c = tmp.charAt(i);
				sb.append(map.containsKey(c) ? map.get(c) : c);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
