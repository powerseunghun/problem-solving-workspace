package Programmers.level2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Camouflage {
	public static int solution(String[][] clothes) {
		Map<String, Integer> map = new HashMap<>();
		Set<String> kSet = null;
		Iterator iter = null;
		int count = 1;
		for (int i = 0; i < clothes.length; i++) {
			int tmp = 0;
			if (!map.containsKey(clothes[i][1])) {
				tmp = 1;
			}
			else {
				tmp = map.get(clothes[i][1]) + 1;
			}
			map.put(clothes[i][1], tmp);
		}
		kSet = map.keySet();
		iter = kSet.iterator();
		
		while (iter.hasNext()) {
			count *= (map.get(iter.next()) + 1);
		}
		
		return --count;
	}
	public static void main(String[] args) {
		String[][] clothes = {
				{"yellowhat", "headgear"},
				{"bluesunglasses", "eyewear"},
				{"green_turban", "headgear"}
		};

		System.out.println(solution(clothes));
	}
}
