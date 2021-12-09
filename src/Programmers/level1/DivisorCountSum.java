package Programmers.level1;

public class DivisorCountSum {
	static int getDivisorCount(int n) {
		int count = 0;
		for (int i = 1; i*i <= n; i++) {
			if (n % i == 0) {
				count++;
				if (i*i < n) count++;
			}
			
		}
		return count;
	}
	static int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
        	answer += getDivisorCount(i) % 2 == 0 ? i : i * -1;
        }
        return answer;
    }
	public static void main(String[] args) {
		int left = 13, right = 17;
		System.out.println(solution(left, right));
	}
}
