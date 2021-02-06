package programmers;

public class DigitSum {
	public int solution(int n) {
		int answer = 0;
		while (n != 0) {
			answer += n % 10;
			n /= 10;
		}
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
