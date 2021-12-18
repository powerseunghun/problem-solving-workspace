package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class EnglishWordRelay {
	static Map<Integer, Integer> count = new HashMap<>();
	static Map<String, Integer> check = new HashMap<>();
	static boolean validCheck(String beforeStr, String curStr) {
		if (beforeStr.charAt(beforeStr.length()-1) != curStr.charAt(0)) return false;
		if (check.containsKey(curStr)) return false;
		return true;
	}
	static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int idiot = 0;
        count.put(idiot, 0);
        count.put(1, 1);
        check.put(words[0], 1);
        
        for (int i = 1, order = 1; i < words.length; i++) {
        	order = (order % n) + 1;
        	if (!count.containsKey(order)) {
        		count.put(order, 1);
        	}
        	else count.put(order, count.get(order)+1);
        	if (!validCheck(words[i-1], words[i])) {
        		idiot = order;
        		break;
        	}
        	check.put(words[i], 1);
        }
        answer[0] = idiot;
        answer[1] = count.get(idiot);
        
        return answer;
    }
	public static void main(String[] args) {
//		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
//		String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
		String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};
		int n = 2;
		int[] res = solution(n, words);
		
		System.out.println(res[0] + " , " + res[1]);
	}
}
