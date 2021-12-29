package Programmers.level3;

import java.util.Collections;
import java.util.PriorityQueue;

public class DoubleConditionPriorityQueue {
	static int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        
        for (int i = 0, val = 0, item = 0; i < operations.length; i++) {
        	String cmd = operations[i].split(" ")[0];
        	val = Integer.parseInt(operations[i].split(" ")[1]);
        	
        	if (cmd.equals("I")) {
        		maxQueue.add(val);
        		minQueue.add(val);
        	}
        	else {
        		if (val == 1 && !maxQueue.isEmpty()) {
        			item = maxQueue.poll();
        			minQueue.remove(item);
        		}
        		else if (val == -1 && !minQueue.isEmpty()){
        			item  = minQueue.poll();
        			maxQueue.remove(item);
        		}
        	}
        }
        answer[0] = maxQueue.isEmpty() ? 0 : maxQueue.poll();
        answer[1] = minQueue.isEmpty() ? 0 : minQueue.poll();
        
        return answer;
    }
	public static void main(String[] args) {
//		String[] operations = {"I 16", "D 1"};
		String[] operations = {"I 7", "I 5", "I -5", "D -1"};
		int[] res = solution(operations);
		
		System.out.println(res[0] + " , " + res[1]);
	}
}
