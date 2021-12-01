package Programmers.level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BridgePassTruck {
	static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0, time = 0, curWeight = 0;
        Queue<Integer> q = new LinkedList<>();
        
        for (int i = 0, truck = 0; i < truck_weights.length; i++) {
        	truck = truck_weights[i];
        	
        	while (true) {
        		if (q.isEmpty()) {
        			q.add(truck);
        			curWeight += truck;
        			time++;
        			break;
        		}
        		else if (q.size() == bridge_length) {
        			int out = q.poll();
        			curWeight -= out;
        		}
        		else {
        			if (weight >= (curWeight + truck)) {
        				q.add(truck);
        				curWeight += truck;
        				time++;
        				break;
        			}
        			else q.add(0);
        			time++;
        		}
        	}
        }
        answer = time + bridge_length;
        return answer;
    }
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int bridge_length = 2, weight = 10;
		int[] truck_weights = {7, 4, 5, 6};
		
		System.out.println(solution(bridge_length, weight, truck_weights));
	}
}
