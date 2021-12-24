package Programmers.level2;

import java.util.Arrays;

public class MakeMinValue {
	static int solution(int []A, int []B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int i = 0, j = B.length-1; i < A.length; i++, j--) {
        	answer += (A[i] * B[j]);
        }
        
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
