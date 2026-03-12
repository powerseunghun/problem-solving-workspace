package Acmicpc.As.B3.ThirtyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ALittleLeftoverPizza35373 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), l = 0, res = 0;
		char s = ' ';
		String str = null;
		
		while(n-- > 0) {
			str = br.readLine();
			s = str.split(" ")[0].charAt(0);
			l = Integer.parseInt(str.split(" ")[1]);
			map.put(s, map.getOrDefault(s, 0)+l);
		}
		res += map.containsKey('S') ? (map.get('S')+5)/6 : 0;
		res += map.containsKey('M') ? (map.get('M')+7)/8 : 0;
		res += map.containsKey('L') ? (map.get('L')+11)/12 : 0;
		
		System.out.println(res);
		br.close();
	}
}
