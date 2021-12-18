package Programmers.level2;

import java.util.Arrays;

public class LifeBoat {
	static int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        for (int i = people.length-1, j = 0; i >= j; i--) {
        	if (i == j) {
        		if (people[i] <= limit) answer++;
        	}
        	else {
        		if (people[i] + people[j] > limit) answer++;
        		else {
        			answer++;
        			j++;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int limit = 100;
		int[] people = {70, 50, 80, 50};
		System.out.println(solution(people, limit));
	}
}
