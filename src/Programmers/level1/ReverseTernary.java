package Programmers.level1;

public class ReverseTernary {
	public int solution(int n) {
		String s = "";
		int answer = 0;
		while (n != 0) {
			s += n % 3;
			n /= 3;
		}
		for (int i = s.length() - 1; i >= 0; i--) {
			int num = s.charAt(i) - 48;
			int num2 = (int) Math.pow(3, s.length() -1 - i);
			answer += num * num2;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new ReverseTernary().solution(45));
	}
}
