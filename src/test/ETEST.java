package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ETEST {
	static Map<Character, Integer> map = new HashMap<>();
	static List<Integer> passIdx = new ArrayList<>();
	static List<Integer> failIdx = new ArrayList<>();
	static void mapInit() {
		int value = 5;
		for (char c = 'A'; c <= 'F'; c++) {
			map.put(c, value--);
		}
	}
	static void check1(String[] scores) {
		// first, secondCondtion
		for (int i = 0, base = 0, cmpLength = 0; i < scores.length; i++) {
			base = scores[i].length();
			cmpLength = scores[i].replace("F", "").length();
			if (Math.abs(base-cmpLength) >= 2) {
				System.out.println("fail : " + scores[i]);
				failIdx.add(i);
				continue;
			}
			cmpLength = scores[i].replace("A", "").length();
			if (Math.abs(base-cmpLength) >= 2) {
				System.out.println("pass : " + scores[i]);
				passIdx.add(i);
			}
		}
	}
	static boolean check2(String str) {
		System.out.println("str : " + str);
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int sum = 0;
		
		for (int i = 0, value = 0; i < str.length(); i++) {
			value = map.get(str.charAt(i));
			max = Math.max(max, value);
			min = Math.min(min, value);
			sum += value;
		}
		sum = (sum - max+min);
		sum /= (str.length()-2);
		
		if (sum >= 3) return true;
		return false;
	}
	static int solution(String[] scores) {
		int answer = 0;
		mapInit();
		check1(scores);
		
        for (int i = 0; i < scores.length; i++) {
        	if (failIdx.contains(i) || passIdx.contains(i)) continue;
        	if (check2(scores[i])) answer++;
        }
        return answer + passIdx.size();
    }
	public static void main(String[] args) {
		String[] scores = {"AAFAFA", "FEECAA", "FABBCB", "CBEDEE", "CCCCCC"};
		System.out.println(solution(scores));
	}
}
