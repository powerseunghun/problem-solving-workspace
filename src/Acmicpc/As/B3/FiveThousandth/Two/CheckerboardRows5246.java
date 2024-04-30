package Acmicpc.As.B3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import Acmicpc.Sorting.TwoThousandth.Nine.FeequencySort2910;

public class CheckerboardRows5246 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, cur = 0, max = 0, v = 0;
		StringTokenizer st = null;
		Map<Integer, Integer> map = new HashMap<>();
		
		while(T-- > 0) {
			map.clear();
			max = 0;
			cur = Integer.MAX_VALUE;
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			
			while(N-- > 0) {
				st.nextToken();
				v = Integer.parseInt(st.nextToken());
				map.put(v, map.getOrDefault(v, 0)+1);
				max = Math.max(max, map.get(v));
			}
			for (Integer key : map.keySet()) {
				if (map.get(key) == max && cur > key) {
					cur = key;
				}
			}
			sb.append(cur).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
