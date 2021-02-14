package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DivisorArray {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] % divisor == 0) {
        		list.add(arr[i]);
        	}
        }
        answer = list.size() != 0 ? new int[list.size()] : null;
        
        if (answer == null) {
        	answer = new int[1];
        	answer[0] = -1;
        	return answer;
        }
        
        for (int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {3, 2, 6};
		int divisor = 10;
		
		int[] answer = new DivisorArray().solution(arr, divisor);
		
		for (int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
