package Programmers.kakao;

public class FailureRate {
	public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] personInStage = new int[N + 2];
        int stage = 1, count = 0;
        
        for (int i = 0; i < stages.length; i++) {
        	personInStage[stages[i]]++;
        }
        for (int i = 0; i < personInStage.length; i++) {
        	System.out.print(personInStage[i] + " ");
        }
        System.out.println();
        int partSum = 0;
        for (int i = 1; i < personInStage.length - 1; i++) {
        	for (int j = 1; j <= i; j++) {
        		partSum += personInStage[j];
        	}
        	System.out.println(partSum);
        	// total - partSum
        	partSum = 0;
        }
//        for (int i = 0 ; i < personInStage.length; i++) {
//        }
        
        return answer;
    }
	public static void main(String[] args) {
		int N = 5;
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		new FailureRate().solution(N, stages);
	}
}
