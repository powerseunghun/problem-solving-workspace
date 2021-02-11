package Programmers.level1;

public class RegPhoneNum {
	public String solution(String phone_number) {
        String answer = "";
        for (int i = 0; i < phone_number.length(); i++) {
        	answer = answer + (i < phone_number.length() - 4 ? "*" : phone_number.charAt(i));
        }
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
