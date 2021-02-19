package Programmers.level2;

public class MakeBigNumber {
	public String solution(String number, int k) {
        String answer = "", subs ="";
        StringBuilder sb = new StringBuilder();
        int loop = number.length() - k, max = 0;
		int startIdx = -1, lastIdx = loop - 1;
        for (int i = 0; i < loop; i++) {
        	max = 0;
        	for (int j = startIdx + 1; j < number.length() - (lastIdx - i); j++) {
        		if (number.charAt(j) - 48 == 9) {
        			max = 9;
        			startIdx = j;
        			break;
        		}
        		if (number.charAt(j) - 48 > max) {
        			max = number.charAt(j) - 48;
        			startIdx = j;
        		}
        	}
        	sb.append(max);
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(new MakeBigNumber().solution("1924", 2));
	}
}
