package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Max9913 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), v = 0, res = Integer.MIN_VALUE;
		Map<Integer, Integer> map = new HashMap<>();
		
		while(N-- > 0) {
			v = Integer.parseInt(br.readLine());
			map.put(v, map.getOrDefault(v, 0)+1);
		}
		
		for (Integer k : map.keySet()) {
			res = Math.max(res, map.get(k));
		}
		
		System.out.println(res);
		br.close();
	}
}
