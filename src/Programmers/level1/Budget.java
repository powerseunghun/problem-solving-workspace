package Programmers.level1;

import java.util.Arrays;

public class Budget {
	public int solution(int[] d, int budget) {
        int answer = 0, sum = 0;
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
            if (sum <= budget) answer++;
            else break;
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
