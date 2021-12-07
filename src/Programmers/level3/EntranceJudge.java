package Programmers.level3;

import java.util.Arrays;

public class EntranceJudge {
	static long solution(int n, int[] times) {
        Arrays.sort(times);
        long answer = 0, left = 0, right = 0;
        long mid = 0, sum = 0;
        
        left = 0;
        right = (long)n * times[times.length-1];
        while (left <= right) {
            mid = (left + right) / 2;
            sum = 0;
            
            for (int i = 0; i < times.length; i++) {
                sum += mid / times[i];
            }
            if (sum < n) left = mid+1;
            else {
                right = mid-1;
                answer = mid;
            }
        }
        return answer;
    }
	public static void main(String[] args) {
		int n = 6;
		int [] times = {7, 10};
		
		System.out.println(solution(n, times));
	}
}
