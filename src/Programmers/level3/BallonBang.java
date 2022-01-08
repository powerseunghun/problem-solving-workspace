package Programmers.level3;

public class BallonBang {
	static int solution(int[] a) {
		if (a.length==1) return 1;
        int answer = 2, leftMin = a[0], rightMin = a[a.length-1];
        
        for (int i = 1; i < a.length-1; i++) {
        	if (a[i] < leftMin) {
        		leftMin = a[i];
        		answer++;
        	}
        }
        for (int i = a.length-2; i >= 1; i--) {
        	if (a[i] < rightMin) {
        		rightMin = a[i];
        		answer++;
        	}
        }
        return leftMin==rightMin ? answer-1 : answer;
    }
	public static void main(String[] args) {
		int[] a = {9, -1, -5};
		int[] b = {-16,27,65,-2,58,-92,-71,-68,-61,-33};
		System.out.println(solution(b));
	}
}
