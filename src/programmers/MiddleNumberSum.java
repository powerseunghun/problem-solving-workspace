package programmers;

public class MiddleNumberSum {
	public long solution(int a, int b) {
        long answer = 0;
        int max = a >= b ? a : b;
		int min = max == a ? b : a;
        
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
