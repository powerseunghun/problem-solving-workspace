package Programmers.kakao;

public class StringCompression {
	static int solution(String s) {
        int answer = s.length(), count = 0;
        String compressStr = null, tmp = null, cmp = null;
        
        for (int i = 1; i < s.length()/2+1; i++) {
        	compressStr = "";
        	count = 1;
        	for (int j = 0; j <= s.length()+i; j+=i) {
        		tmp = null;
        		if (j >= s.length()) tmp = "";
        		else if (j+i > s.length()) tmp = s.substring(j);
        		else tmp = s.substring(j, j+i);
        		if (j > 0) {
        			if (tmp.equals(cmp)) count++;
        			else if (!tmp.equals(cmp) && count >= 2) {
        				compressStr += (count+cmp);
        				count=1;
        			}
        			else {
        				compressStr += cmp;
        			}
        		}
        		cmp = tmp;
        	}
        	answer = Math.min(answer, compressStr.length());
        }
        
        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution("aabbaccc"));
		System.out.println(solution("ababcdcdababcdcd"));
		System.out.println(solution("abcabcdede"));
		System.out.println(solution("abcabcabcabcdededededede"));
		System.out.println(solution("xababcdcdababcdcd"));
	}
}
