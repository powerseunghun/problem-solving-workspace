package Programmers.kakao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class GemShopping {
	static Set<String> set = new HashSet<>();
	static Map<String, Integer> map = new HashMap<>();
	static Queue<String> seq = new LinkedList<>();
	static void setInit(String[] gems) {
		for (int i = 0; i < gems.length; i++) {
			set.add(gems[i]);
		}
	}
//	static String sequenceStr(int left, int right, String[] gems) {
//		StringBuilder sb = new StringBuilder();
//		for (int i = left; i <= right; i++) {
//			sb.append(gems[i] + " ");
//		}
//		return sb.toString();
//	}
//	static boolean check(String str) {
//		for (String s : set) {
//			if (!str.contains(s)) return false;
//		}
//		return true;
//	}
	static int[] solution(String[] gems) {
        int[] answer = new int[2];
        int start = 0, tmp = 0, seqSize = 100001;
        setInit(gems);
        
        for (int i = 0; i < gems.length; i++) {
        	if (!map.containsKey(gems[i])) map.put(gems[i], 1);
        	else map.put(gems[i], map.get(gems[i])+1);
        	seq.add(gems[i]);
        	
        	while (true) {
        		if (map.get(seq.peek()) >= 2) {
        			map.put(seq.peek(), map.get(seq.peek())-1);
        			seq.poll();
        			tmp++;
        			continue;
        		}
        		break;
        	}
        	if (set.size() == map.size() && seq.size() < seqSize) {
        		seqSize = seq.size();
        		start = tmp;
        	}
        }
        answer[0] = start+1;
        answer[1] = start+seqSize;
        
        return answer;
    }
	public static void main(String[] args) {
		String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
		int[] res = solution(gems);
		
		System.out.println(res[0] + " , " + res[1]);
	}
}
