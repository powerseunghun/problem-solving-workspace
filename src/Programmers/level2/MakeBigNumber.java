package Programmers.level2;

public class MakeBigNumber {
	public String solution(String number, int k) {
        String answer = "", subs ="";
        int loop = number.length() - k, max = 0;
		int maxIdx = 0, subIdx = loop - 1;
        for (int i = 0; i < loop; i++) {
        	max = 0;
        	subs = number.substring(0, number.length() - subIdx + i);
        	System.out.println("sub : " + subs);
        	for (int j = 0; j < subs.length(); j++) {
        		if (subs.charAt(j) - 48 > max) {
        			max = subs.charAt(j) - 48;
        			maxIdx = j;
        		}
        		
        	}
        	answer += max;
        	String tmp = number.toString();
        	number = "";
        	for (int j = 0; j < tmp.length(); j++) {
        		if (j == maxIdx) continue;
        		else number += tmp.charAt(j);
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
//		System.out.println(new MakeBigNumber().solution("4177252841", 4));
		
//		System.out.println('1' - 48);
		System.out.println("123456789".substring(2, 4));
		
	}
}
