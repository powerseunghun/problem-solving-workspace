package programmers;

public class StringToInteger {
	public int solution(String s) {
		int answer = 0;
		answer = s.charAt(0) == '-' 
				? Integer.parseInt(s.substring(1, s.length())) * -1 
				: Integer.parseInt(s.substring(0, s.length()));
		
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
