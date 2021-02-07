package Programmers.level1;

public class FindPrime {
	public int solution(int n) {
		int answer = 0;
		int[] prime = new int[1000000];
		
		for (int i = 2; i <= n; i++) {
			prime[i] = i;
		}
		
		for (int i = 2; i <= n; i++) {
			if (prime[i] == 0) continue;
			for (int j = i + i; j <= n; j += i) {
				prime[j] = 0;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (prime[i] != 0) answer++;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
