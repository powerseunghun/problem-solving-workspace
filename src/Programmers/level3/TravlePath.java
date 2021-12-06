package Programmers.level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TravlePath {
	static Map<String, ArrayList<String>> map = new HashMap<>();
	static Map<String, Boolean> checkMap = new HashMap<>();
	static ArrayList<String> resList = new ArrayList<>();
	
	static void mapInit(String[][] tickets) {
		String a = null, b = null;
		for (int i = 0; i < tickets.length; i++) {
			a = tickets[i][0];
			b = tickets[i][1];
			
			ArrayList<String> tmp = !map.containsKey(a) ? new ArrayList<>() : map.get(a);
			tmp.add(b);
			map.put(a, tmp);
		}
	}
	static void func(String a, String str) {
		ArrayList<String> list = map.get(a);
		
		boolean flag = false;
		for (int i = 0; i < (list == null ? 0 : list.size()); i++) {
			String checkString = a + " " + list.get(i);
			
			if (!checkMap.containsKey(checkString)) {
				flag = true;
				checkMap.put(checkString, false);
				func(list.get(i), str+list.get(i)+" ");
				checkMap.remove(checkString);
			}
		}
		
		if (!flag) resList.add(str);
	}
	public static void main(String[] args) {
		String[][] tickets = {{"ICN", "JFK"},{"HND", "IAD"},{"JFK", "HND"}};
//		String[][] tickets = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL", "SFO"}};
		String[] res = null;
		mapInit(tickets);
		func("ICN", "ICN ");
		
		Collections.sort(resList);
		res = resList.get(0).split(" ");
		
		for (String str : res) {
			System.out.print(str + " ");
		}
		System.out.println();
		return;
	}
}
