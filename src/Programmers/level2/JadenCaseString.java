package Programmers.level2;

import java.util.StringTokenizer;

public class JadenCaseString {
	static String solution(String s) {
        String answer = "", tmp = null;
        StringTokenizer st = new StringTokenizer(s);
        
//        while (true) {
//        	tmp = st.nextToken().toLowerCase();
//        	
//        	if (tmp.charAt(0) >= 'a' && tmp.charAt(0) <= 'z') {
//        		answer += (char)(tmp.charAt(0)-32);
//        		answer += tmp.substring(1, tmp.length());
//        	}
//        	else answer += tmp;
//        	if (!st.hasMoreTokens()) break;
//        	answer += " ";
//        }
        s = s.toLowerCase();
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            answer += (char)(s.charAt(0)-32);
        }
        else answer += s.charAt(0);
        
        for (int i = 1; i < s.length(); i++) {
        	if (s.charAt(i) == ' ') answer += s.charAt(i);
        	else if (s.charAt(i-1) == ' ') answer += (char)(s.charAt(i)-32);
        	else answer += s.charAt(i);
        }
        return answer;
    }
	public static void main(String[] args) {
		String s = "3people unFollowed me";
		System.out.println(solution(s));
	}
}
