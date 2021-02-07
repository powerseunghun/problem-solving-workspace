package Programmers.level1;

public class CeasarEncryption {
	public String solution(String s, int n) {
		String answer = "";
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			if (tmp == ' ') answer += " ";
			else if (tmp >= 'a' && tmp <= 'z') {
				tmp += n;
				if (tmp > 122) tmp -= 26;
				answer += (char) tmp;
			}
			else {
				tmp += n;
				if (tmp > 90) tmp -= 26;
				answer += (char) tmp;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
