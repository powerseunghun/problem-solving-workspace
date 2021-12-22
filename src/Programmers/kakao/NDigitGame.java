package Programmers.kakao;

import java.util.HashMap;
import java.util.Map;

public class NDigitGame {
	static Map<Integer, Character> map = new HashMap<>();
	static void mapInit() {
		char c = '0';
		for (int i = 0; i < 10; i++) {
			map.put(i, c++);
		}
		c = 'A';
		for (int i = 10; i < 16; i++) {
			map.put(i, c++);
		}
	}
	static String change(int val, int n) {
		if (val == 0) return "0";
		StringBuilder sb = new StringBuilder();
		while (val != 0) {
			sb.append(map.get(val%n));
			val /= n;
		}
		return sb.reverse().toString();
	}
	static String solution(int n, int t, int m, int p) {
		boolean flag = true;
		int val = 0, order = 0;
        String answer = "", str = null;
        mapInit();
        
        while (flag) {
        	str = change(val++, n);
        	for (int i = 0; i < str.length(); i++) {
        		order++;
        		if (order == p) {
        			answer += str.charAt(i);
        			p += m;
        			if (answer.length() == t) {
        				flag = false;
        				break;
        			}
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int n = 16, t = 16, m = 2, p = 1;
		System.out.println(solution(n, t, m, p));
	}
}
