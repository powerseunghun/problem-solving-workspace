package Acmicpc.Sorting.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class FeequencySort2910 {
	static Map<Integer, Integer> map = new HashMap<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]), val = 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		while (st.hasMoreTokens()) {
			val = Integer.parseInt(st.nextToken());
			if (!map.containsKey(val)) {
				map.put(val, 1);
				list.add(val);
			}
			else map.put(val, map.get(val)+1);
		}
		
		Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return map.get(o2) - map.get(o1);
			}
		});
		
		for (int i = 0, key = 0; i < list.size(); i++) {
			key = list.get(i);
			for (int j = 0; j < map.get(key); j++) {
				sb.append(key + " ");
			}
		}
		System.out.println(sb.toString());
	}
}
