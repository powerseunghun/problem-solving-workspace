package Programmers.kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compression {
	static Map<String, Integer> map = new HashMap<>();
	static List<Integer> list = new ArrayList<>();
	static void mapInit() {
		int value = 1;
		for (char c = 'A'; c <= 'Z'; c++) {
			map.put(c+"", value++);
		}
	}
	static int[] solution(String msg) {
		int idx = 0, mapIdx = 27;
		mapInit();
        int[] answer = {};
        String str = "";
        
        while (true) {
        	str = msg.charAt(idx++) + "";
        	while (map.containsKey(str) && idx < msg.length()) {
        		str += msg.charAt(idx++);
        	}
        	if (map.containsKey(str)) {
        		list.add(map.get(str));
        		break;
        	}
        	else {
        		list.add(map.get(str.subSequence(0, str.length()-1)));
        		map.put(str, mapIdx++);
        		idx--;
        	}
        }
        answer = new int[list.size()];
        
        for (int i = 0; i < answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		String str = "TOBEORNOTTOBEORTOBEORNOT";
		int[] res = solution(str);
		
		for (int el : res) {
			System.out.print(el + " ");
		}
	}
}
