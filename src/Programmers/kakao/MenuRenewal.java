package Programmers.kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MenuRenewal {
	static Map<String, Integer> map = new HashMap<>();
	static List<String> tmpList = new ArrayList<>();
	static void dfs(int n, int d, int idx, String orders, String str) {
		if (d >= n) {
			tmpList.add(str);
			return;
		}
		
		for (int i = idx; i < orders.length(); i++) {
			dfs(n, d+1, i+1, orders, str+orders.charAt(i));
		}
		
	}
	static String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        String menu = null;
        int maxCourse = 0;
        int[] maxPerCourse = null;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < orders.length; i++) {
        	for (int j = 0; j < course.length; j++) {
        		maxCourse = Math.max(course[j], maxCourse);
        		dfs(course[j], 0, 0, orders[i], "");
        	}
        }
        
        maxPerCourse = new int[maxCourse+1];
        
        for (int i = 0; i < tmpList.size(); i++) {
        	menu = tmpList.get(i);
        	
        	if (!map.containsKey(menu)) map.put(menu, 1);
        	else map.put(menu, map.get(menu)+1);
        	maxPerCourse[menu.length()] = Math.max(maxPerCourse[menu.length()], map.get(menu));
        }
        
        Iterator iter = map.keySet().iterator();
        while (iter.hasNext()) {
        	menu = (String)iter.next();
        	if (maxPerCourse[menu.length()] == map.get(menu) && maxPerCourse[menu.length()] > 1) {
        		list.add(menu);
        	}
        }
        Collections.sort(list);
        answer = new String[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		String[] orders = {"ABCDE", "AB", "CD", "ADE", "XYZ", "XYZ", "ACD"};
		int[] course = {2, 3, 5};
		solution(orders, course);
	}
}
