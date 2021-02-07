package programmers;

public class EliminationMinNum {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length - 1];
		int min = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		for (int i = 0, idx = 0; i < arr.length; i++) {
			if (min != arr[i]) answer[idx++] = arr[i];
		}
		if (answer.length == 0) {
			answer = new int[1];
			answer[0] = -1;
		}
		
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
