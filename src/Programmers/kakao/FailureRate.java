package Programmers.kakao;

public class FailureRate {
	public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] personInStage = new int[N + 2];
        double[] failureRate = new double[N], failureRateCopy = new double[N];
        int partSum = 0;
        
        for (int i = 0; i < stages.length; i++) {
        	personInStage[stages[i]]++;
        }
        for (int i = 0; i < personInStage.length - 2; i++) {
        	partSum = 0;
        	for (int j = 0; j <= i; j++) {
        		partSum += personInStage[j];
        	}
        	int base = stages.length - partSum;
        	failureRate[i] = base == 0 ? 0.0 : (double)personInStage[i+1] / base;
        }
        failureRateCopy = failureRate.clone();
        
        for (int i = 0; i < failureRateCopy.length-1; i++) {
        	for (int j = 0; j < failureRateCopy.length - (i + 1); j++) {
        		if (failureRateCopy[j] < failureRateCopy[j + 1]) {
        			double tmp = failureRateCopy[j];
        			failureRateCopy[j] = failureRateCopy[j+1];
        			failureRateCopy[j+1] = tmp;
        		}
        	}
        }
        for (int i = 0; i < failureRateCopy.length; i++) {
        	for (int j = 0; j < failureRate.length; j++) {
        		if (failureRateCopy[i] == failureRate[j]) {
        			answer[i] = j + 1;
        			failureRate[j] = -1.0;
        			break;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
	}
}
