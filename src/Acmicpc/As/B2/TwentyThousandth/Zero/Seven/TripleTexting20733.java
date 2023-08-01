package Acmicpc.As.B2.TwentyThousandth.Zero.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripleTexting20733 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), kStr = null;;
		Map<String, Integer> map = new HashMap<>();
		int max = Integer.MIN_VALUE;
		
		for (int i = 0, w = str.length()/3; i < str.length(); i += w) {
			kStr = str.substring(i, i+w);
			map.put(kStr, map.getOrDefault(kStr, 0)+1);
			max = Math.max(max, map.get(kStr));		
		}
		
		for (String key : map.keySet()) {
			kStr = map.get(key) == max ? key : kStr;
		}
		
		System.out.println(kStr);
		br.close();
	}
}
