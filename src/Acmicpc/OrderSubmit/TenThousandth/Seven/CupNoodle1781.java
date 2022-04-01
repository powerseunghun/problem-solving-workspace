package Acmicpc.OrderSubmit.TenThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class CupNoodle1781 {
	static Map<Integer, List<Integer>> map = new HashMap<>();
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		String tmp = null;
		List<Integer> tList = null;
		
		for (int i = 0, a = 0, b = 0; i < N; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			
			tList = map.getOrDefault(a, new ArrayList<>());
			tList.add(b);
			map.put(a, tList);
		}
		
		tList = new ArrayList<Integer>(map.keySet());
		Collections.sort(tList);
		
		for (int i = 0, n = 0; i < tList.size(); i++) {
			n = tList.get(i);
			List<Integer> tList2 = map.get(n);
			for (int j = 0; j < tList2.size(); j++) {
				pq.add(tList2.get(j));
				while (pq.size() > n) pq.poll();
			}
		}
		
		while (!pq.isEmpty()) {
			res += pq.poll();
		}
		System.out.println(res);
		br.close();
	}
}
