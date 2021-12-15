package Programmers.level2;

public class ExpectedPlan {
	static int solution(int n, int a, int b) {
        int answer = 0;
        while(a != b) {
        	if (a % 2 != 0) a++;
        	if (b % 2 != 0) b++;
        	a = a/2;
        	b = b/2;
        	answer++;
        }

        return answer;
    }
	public static void main(String[] args) {
		int n = 8, a = 4, b = 7;
		System.out.println(solution(n, a, b));
	}
}
