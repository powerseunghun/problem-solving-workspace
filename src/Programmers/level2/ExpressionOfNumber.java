package Programmers.level2;

public class ExpressionOfNumber {
	static int solution(int n) {
        int answer = 1, sum = 0;
        
        for (int i = 1; i <= n/2; i++) {
        	sum = i;
        	for (int j = i+1; ;j++) {
        		sum += j;
        		if (sum >= n) {
        			if (sum == n) answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int n = 15;
		System.out.println(solution(n));
	} 
}
