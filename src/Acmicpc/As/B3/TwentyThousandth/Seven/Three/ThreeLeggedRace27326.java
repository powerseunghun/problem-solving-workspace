package Acmicpc.As.B3.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class ThreeLeggedRace27326 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		int v = 0, res = 0;
		
		while (st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		
		for (Integer k : map.keySet()) {
			if (map.get(k) < 2) {
				res = k;
				break;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
