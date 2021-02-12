package Programmers.level1;

import java.util.Arrays;

public class KNumber {
	public int[] solution(int[] array, int[][] commands) {
        int[] answer = {}, tmp = {};
        answer = new int[commands.length];
        int index = 0;
        for (int i = 0; i < commands.length; i++) {
        	tmp = new int[commands[i][1] - commands[i][0] + 1];
        	index = 0;
        	for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++) {
        		tmp[index++] = array[j];
        	}
        	Arrays.sort(tmp);
        	answer[i] = tmp[commands[i][2] - 1];
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
