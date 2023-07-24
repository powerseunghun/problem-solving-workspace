package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class RareNumber24085 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		int v = 0, min = Integer.MAX_VALUE, res = Integer.MAX_VALUE;
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		for (Integer k : map.keySet()) {
			min = Math.min(min, map.get(k));
		}
		for (Integer k : map.keySet()) {
			res = map.get(k) == min && res > k ? k : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
