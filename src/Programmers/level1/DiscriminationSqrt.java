package Programmers.level1;

public class DiscriminationSqrt {
	public long solution(long n) {
		long answer = 0;
		double sqrt = Math.sqrt(n);
		if (sqrt - (int)sqrt == 0) {
			answer = (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
		}
		else answer = -1;
		
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
