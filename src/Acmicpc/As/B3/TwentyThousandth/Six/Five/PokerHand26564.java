package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokerHand26564 {
	static Map<Character, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE;
		StringTokenizer st = null;
		String str = null;
		
		while(N-- > 0) {
			map.clear();
			st = new StringTokenizer(br.readLine());
			while(st.hasMoreTokens()) {
				str = st.nextToken();
				map.put(str.charAt(0), map.getOrDefault(str.charAt(0), 0)+1);
			}
			
			max = Integer.MIN_VALUE;
			for (Character c : map.keySet()) {
				max = Math.max(max, map.get(c));
			}
			sb.append(max + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
