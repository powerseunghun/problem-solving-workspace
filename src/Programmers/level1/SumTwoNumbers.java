package Programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class SumTwoNumbers {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        int[] check = new int[200];
        int sum = 0, count = 0;
        
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                sum = numbers[i] + numbers[j];
                if (check[sum] == 0) {
                    check[sum] = 1;
                    count++;
                }
            }
        }
        answer = new int[count];
        count = 0;
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 1) {
                answer[count++] = i;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		int[] numbers = {2, 1, 3, 4, 1};
		
	}
}
