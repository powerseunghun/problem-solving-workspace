package Acmicpc.As.B3.ThirtyThousandth.Two.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnimalFarm32449 {
	static int func(int pMax, List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < pMax) return list.get(i);
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, List<Integer>> map = new HashMap<>();
		List<Integer> list = null;
		int n = Integer.parseInt(br.readLine()), v = 0, pMax = Integer.MIN_VALUE;
		long res = 0;
		String str = null;
		
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			v = Integer.parseInt(str.split(" ")[1]);
			if (str.indexOf("pig") >= 0) {
				pMax = Math.max(pMax, v);
				continue;
			}
			list = map.containsKey(str.split(" ")[0]) ? map.get(str.split(" ")[0]) : new ArrayList<>();
			list.add(v);
			Collections.sort(list, Collections.reverseOrder());
			map.put(str.split(" ")[0], list);
		}
		res += pMax;
		
		for (String s  : map.keySet()) {
			res += func(pMax, map.get(s));
		}
		
		System.out.println(res);
		br.close();
	}
}
