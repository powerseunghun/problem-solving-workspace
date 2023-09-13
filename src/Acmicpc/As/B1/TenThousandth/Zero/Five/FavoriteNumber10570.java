package Acmicpc.As.B1.TenThousandth.Zero.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class FavoriteNumber10570 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v = 0, s = 0, max = 0, maxVal = 0;
		
		while(N-- > 0) {
			v = Integer.parseInt(br.readLine());
			map.clear();
			while (v-- > 0) {
				s = Integer.parseInt(br.readLine());
				map.put(s, map.getOrDefault(s, 0)+1);
			}
			max = Integer.MIN_VALUE;
			maxVal = Integer.MAX_VALUE;
			// 42 2
			// 19 1
			for (Integer val : map.values()) {
				max = Math.max(val, max);
			}
			
			for (Integer k : map.keySet()) {
				v = map.get(k);
				if (v == max && maxVal > k) maxVal = k;
			}
			
			sb.append(maxVal).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
