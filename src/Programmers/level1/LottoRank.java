package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class LottoRank {
	static int[] rank = {6, 6, 5, 4, 3, 2, 1};
	static int[] solution(int[] lottos, int[] win_nums) {
		Map<Integer, Integer> map = new HashMap<>();
        int[] answer = new int[2];
        int ambCount = 0, match = 0;
        for (int i = 0; i < lottos.length; i++) {
        	if (lottos[i] == 0) {
        		ambCount++;
        		continue;
        	}
        	if (!map.containsKey(lottos[i])) map.put(lottos[i], 1);
        }
        
        for (int i = 0; i < win_nums.length; i++) {
        	if (map.containsKey(win_nums[i])) match++;
        }
        
        answer[0] = rank[match+ambCount];
        answer[1] = rank[match];
        
        return answer;
    }
	public static void main(String[] args) {
		int[] lottos = {44,1,0,0,31,25};
		int[] win_nums = {31,10,45,1,6,19};
		
		System.out.println(solution(lottos, win_nums));
	}
}
