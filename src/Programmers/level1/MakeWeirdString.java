package Programmers.level1;

public class MakeWeirdString {
	public String solution(String s) {
		String answer = "";
		String tmp = "";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ') {
				count = 0;
				answer += " ";
				continue;
			}
			switch(count % 2) {
			case 0:
				tmp = (s.charAt(i) + "").toUpperCase();
				break;
			case 1:
				tmp = (s.charAt(i) + "").toLowerCase();
				break;
			}
			count++;
			answer += tmp;
		}
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new MakeWeirdString().solution("try hello world"));
	}
}
