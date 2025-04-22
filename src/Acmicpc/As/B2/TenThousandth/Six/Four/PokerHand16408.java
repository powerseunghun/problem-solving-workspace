package Acmicpc.As.B2.TenThousandth.Six.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokerHand16408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Character, Integer> map = new HashMap<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int res = 0;
		
		while(st.hasMoreTokens()) {
			char c = st.nextToken().charAt(0);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for (Integer v : map.values()) {
			res = Math.max(v, res);
		}
		
		System.out.println(res);
		br.close();
	}
}
