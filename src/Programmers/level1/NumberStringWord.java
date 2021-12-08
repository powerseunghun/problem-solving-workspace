package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class NumberStringWord {
	static Map<String, Integer> map = new HashMap<>();
	static void mapInit() {
		String[] tmp = {"zero", "one", "two", "three" ,"four", "five", "six", "seven" ,"eight", "nine"};
		for (int i = 0; i < tmp.length; i++) {
			map.put(tmp[i], i);
		}
	}
	static int solution(String s) {
		String answer = "", tmp = "";
        
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				tmp += s.charAt(i);
				if (map.containsKey(tmp)) {
					answer += map.get(tmp);
					tmp = "";
				}
				continue;
			}
			answer += s.charAt(i);
		}
        return Integer.parseInt(answer);
    }
	public static void main(String[] args) {
		String s = "2three45sixseven";
		mapInit();
		System.out.println(solution(s));
	}
}
