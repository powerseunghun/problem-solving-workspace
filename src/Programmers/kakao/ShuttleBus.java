package Programmers.kakao;

import java.util.PriorityQueue;

public class ShuttleBus {
	static void inputQueue(String[] timetable, PriorityQueue<Integer> pq) {
		for (int i = 0, time = 0; i < timetable.length; i++, time = 0) {
			time += Integer.parseInt(timetable[i].split(":")[0]) * 60;
			time += Integer.parseInt(timetable[i].split(":")[1]);
			pq.add(time);
		}
	}
	static String solution(int n, int t, int m, String[] timetable) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int count = 0, time = 540, conTime = 0;
        String answer = "";
        inputQueue(timetable, pq);
        
        for (int i = 0, crew = 0; i < n; i++) {
        	count = 0;
        	while (!pq.isEmpty()) {
        		crew = pq.peek();
        		if (m > count && crew <= time) {
        			pq.poll();
        			count++;
        		}
        		else break;
        		conTime = crew-1;
        	}
        	time += t;
        }
        
        if (count < m) conTime = time-t;
        answer += (String.format("%02d", conTime/60)) + ":" + (String.format("%02d", conTime%60));
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 1, t = 1, m = 5;
		String[] timetable = {"08:00", "08:01", "08:02", "08:03"};
		System.out.println(solution(n, t, m, timetable));
	}
}
