package Acmicpc.DataStructure.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Card11652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Long, Integer> map = new HashMap<>();
		int N = Integer.parseInt(br.readLine()), n = 0;
		long val = 0, max = 1;
		
		for (int i = 0; i < N; i++) {
			val = Long.parseLong(br.readLine());
			if (!map.containsKey(val)) map.put(val, 1);
			else {
				n = map.get(val);
				max = Math.max(max, n+1);
				map.put(val, n+1);
			}
		}
		Object[] keys = map.keySet().toArray();
		Arrays.sort(keys);
		
		for (int i = 0; i < keys.length; i++) {
			if (map.get(keys[i]) == max) {
				System.out.println(keys[i]);
				return;
			}
		}
		
	}
}
