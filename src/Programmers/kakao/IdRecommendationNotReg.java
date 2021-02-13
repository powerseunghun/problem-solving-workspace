package Programmers.kakao;

public class IdRecommendationNotReg {
	// use StringBuffer
	public String solution(String new_id) {
        String answer = "";
        StringBuffer sb = new StringBuffer(new_id);
        int start = 0, end = 0;
        for (int i = 0; i < sb.length(); i++) {
        	if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
        		sb.setCharAt(i, (char)(sb.charAt(i) + 32));
        	}
        	if (!((sb.charAt(i) >= 'a' && sb.charAt(i) <= 'z') || (sb.charAt(i) >= '0' && sb.charAt(i) <= '9') ||sb.charAt(i) == '-' || sb.charAt(i) == '_' || sb.charAt(i) == '.')) {
        		sb.replace(i, i + 1, "");
        		i--;
        	}
        }
        for (int i = 0; i < sb.length() - 1; i++) {
        	if(sb.charAt(i) == '.') {
        		start = i;
        		end = i;
        		for (int j = i + 1; j < sb.length(); j++) {
        			if (sb.charAt(j) == '.') {
        				end = j;
        			}
        			else break;
        		}
        		if (start != end) {
        			sb.replace(start, end + 1, ".");
        		}
        	}
        }
        if (sb.toString().contains(".")) {
        	sb = sb.charAt(0) == '.' ? sb.replace(0, 1, "") : sb;
        }
        if (sb.toString().contains(".")) {
        	sb = sb.charAt(sb.length() - 1) == '.' ? sb.replace(sb.length() - 1, sb.length(), "") : sb;
        }
        sb = sb.toString().equals("") ? sb.append("a") : sb;
        
        if (sb.length() >= 16) {
        	sb = new StringBuffer(sb.substring(0, 15).toString());
        	if (sb.toString().contains(".")) {
            	sb = sb.charAt(sb.length() - 1) == '.' ? sb.replace(sb.length() - 1, sb.length(), "") : sb;
            }
        }
        if (sb.length() <= 2) {
        	for (int i = sb.length(); i < 3; i++) {
        		sb.append(sb.charAt(sb.length() - 1));
        	}
        }
        answer = sb.toString();
        return answer;
    }
	public static void main(String[] args) {
	}
}
