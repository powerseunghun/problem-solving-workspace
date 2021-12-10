package Programmers.level1;

public class FindModOne {
	static int solution(int n) {
		int div = 2;
		while (true) {
			if (n % div == 1) return div;
			div++;
		}
    }
	public static void main(String[] args) {
		System.out.println(solution(12));
	}
}
