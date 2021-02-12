package Programmers.level1;

public class ReplaceRedundancy {
	public int[] solution(int []arr) {
        int[] answer = {};
        int prevNum = -1, count = 0;
        for (int i = 0; i < arr.length; i++) {
        	if(prevNum == arr[i]) continue;
        	else {
        		prevNum = arr[i];
        		count++;
        	}
        }
        answer = new int[count];
        prevNum = -1; count = 0;
        for (int i = 0; i < arr.length; i++) {
        	if(prevNum == arr[i]) continue;
        	else {
        		prevNum = arr[i];
        		answer[count++] = arr[i];
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {1,1, 3, 3, 0, 1, 1};
		new ReplaceRedundancy().solution(arr);
	}
}
