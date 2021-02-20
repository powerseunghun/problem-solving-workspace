package Programmers.kakao;

public class DartGame {
	public int solution(String dartResult) {
        int answer = 0, idx = 0;
        int beforeScore = 0, curScore = 0;
        int[] scores = new int[3];
        String[] resultSet = new String[3];
        String tmp = "", score = "", bonus = "", option = "";
        
    	for (int j = 0; j < dartResult.length(); j++) {
    		tmp += dartResult.charAt(j);
    		if (dartResult.charAt(j) == 'S' || dartResult.charAt(j) == 'D' || dartResult.charAt(j) == 'T') {
    			if (!(j == dartResult.length() - 1)) {
    				if (dartResult.charAt(j + 1) == '*' || dartResult.charAt(j + 1) == '#') {
    					tmp += dartResult.charAt(j + 1);
    					j += 1;
    					resultSet[idx++] = tmp;
    					tmp = "";
    				}
    				else {
    					resultSet[idx++] = tmp;
    					tmp = "";
    				}
    			}
    			else {
    				resultSet[idx++] = tmp;
    				tmp = "";
    			}
    		}
    	}
    	
    	for (int i = 0; i < resultSet.length; i++) {
    		score = ""; bonus = ""; option = "";
    		for (int j = 0; j < resultSet[i].length(); j++) {
    			if (resultSet[i].charAt(j) >= '0' && resultSet[i].charAt(j) <= '9') {
    				score += resultSet[i].charAt(j);
    			}
    			else if (resultSet[i].charAt(j) == 'S' || resultSet[i].charAt(j) == 'D' || resultSet[i].charAt(j) == 'T') {
    				bonus += resultSet[i].charAt(j);
    			}
    			else if (resultSet[i].charAt(j) == '*' || resultSet[i].charAt(j) == '#') {
    				option += resultSet[i].charAt(j);
    			}
    		}
    		switch(bonus) {
    		case "S":
    			curScore = Integer.parseInt(score);
    			break;
    		case "D":
    			curScore = Integer.parseInt(score) * Integer.parseInt(score);
    			break;
    		case "T":
    			curScore = Integer.parseInt(score) * Integer.parseInt(score) * Integer.parseInt(score);
    			break;
    		}
    		switch (option) {
    		case "":
    			answer += curScore;
    			break;
    		case "*":
    			curScore *= 2;
    			answer += curScore + beforeScore;
    			break;
    		case "#":
    			curScore *= -1;
    			answer += curScore;
    			break;
    		}
    		beforeScore = curScore;
    	}
        
        return answer;
    }
	public static void main(String[] args) {
	}
}
