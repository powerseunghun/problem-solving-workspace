package Acmicpc.As.B2.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Mode18413 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int v = 0, res = 0;
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		if (!map.containsKey(0)) {
			map.put(0, 0);
		}
		
		for (int k : map.keySet()) {
			if (map.containsKey(res) && map.get(res) < map.get(k)) {
				res = k;
			}
		}
		
		System.out.println(map.get(res));
		br.close();
		
	}
}
