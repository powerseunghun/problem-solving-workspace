package Acmicpc.As.B2.FiveThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Numbers5489 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), w = 0;
		int res = 0, max = Integer.MIN_VALUE;
		
		while(N-- > 0) {
			w = Integer.parseInt(br.readLine());
			map.put(w, map.getOrDefault(w, 1)+1);
		}
		
		for (Integer i : map.keySet()) {
			w = map.get(i);
			if (max < w) {
				max = w;
				res = i;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
