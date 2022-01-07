package Programmers.level3;

import java.util.Arrays;

public class SurveillanceCamera {
	static int solution(int[][] routes) {
        int answer = 0, build = Integer.MIN_VALUE;
        Arrays.sort(routes, (o1, o2) -> o1[1]-o2[1]);
        
        for (int i = 0; i < routes.length; i++) {
        	if (build < routes[i][0]) {
        		build = routes[i][1];
        		answer++;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5, -3}};
		System.out.println(solution(routes));
	}
}
