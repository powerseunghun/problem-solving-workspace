package Programmers.level3;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DisKController {
	static int solution(int[][] jobs) {
        int answer = 0, endTime = 0, idx = 0, compCount = 0;
        Arrays.sort(jobs, (job1, job2) -> job1[0] - job2[0]);
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((job1, job2) -> job1[1] - job2[1]);
        
        while (compCount < jobs.length) {
        	while (idx < jobs.length && jobs[idx][0] <= endTime) {
        		pq.add(jobs[idx++]);
        	}
        	
        	if(pq.isEmpty()) {
        		endTime = jobs[idx][0];
        		continue;
        	}
        	
        	int[] tmp = pq.poll();
        	answer += ((endTime - tmp[0]) + tmp[1]);
        	endTime += tmp[1];
        	compCount++;
        }
        
        return (int)(answer / jobs.length);
    }
	public static void main(String[] args) {
		int[][] jobs = {{0,3}, {1,9}, {2,6}};
	}
}
