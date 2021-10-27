package test;

public class DTEST2 {
	static int solution(int n, int[] v) {
		int answer = Integer.MIN_VALUE;
		int maxVal = v[0];
		
		for (int i = 1; i < v.length; i++) {
			if (v[i] > maxVal) {
				maxVal = v[i];
			}
			else answer = Math.max(maxVal-v[i], answer);
		}
		if (answer == Integer.MIN_VALUE) {
			for (int i = 1; i < v.length; i++) {
				answer = Math.max(answer, v[i-1]-v[i]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		int[] arr = {1,3,2,4,5,6,7,8,9,10};
		int max = Integer.MIN_VALUE;
		
		int maxVal = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
			else max = Math.max(maxVal-arr[i], max);
		}
		System.out.println(max);
	}
}
