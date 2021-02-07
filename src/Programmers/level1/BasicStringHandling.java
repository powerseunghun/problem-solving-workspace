package Programmers.level1;

public class BasicStringHandling {
	public boolean solution(String s) {
		boolean answer = true;
		
		for (int i = 0; i < s.length(); i++) {
			if (!(s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
				answer = false;
				break;
			}
		}
		
		return (s.length() == 4 || s.length() == 6) && answer;
	}
	public static void main(String[] args) {
		
	}
}
