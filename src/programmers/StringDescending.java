package programmers;

public class StringDescending {
	public String solution(String s) {
		String answer = "";
		char[] str = s.toCharArray();
		
		for (int i = 0; i < str.length - 1; i++) {
			for (int j = i+1; j < str.length; j++) {
				if (str[i] < str[j]) {
					char tmp = str[i];
					str[i] = str[j];
					str[j] = tmp;
				}
			}
		}
//		answer = new String(str);
		answer = String.valueOf(str);
		return answer;
	}
	public static void main(String[] args) {
		System.out.println(new StringDescending().solution("Zbcdefg"));
	}
}
