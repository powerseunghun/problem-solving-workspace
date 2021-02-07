package Programmers.level1;

public class CollatzGuess {
	public int solution(long n) {
		int answer = 0;
		
		for (int i = 0; i < 500 && n != 1; i++) {
			if (n % 2 == 0) {
				n /= 2;
			}
			else {
				n = n * 3 + 1;
			}
			answer++;
		}
		if (answer >= 500) answer = -1;
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new CollatzGuess().solution(626331));
	}
}
