package Programmers.level1;

public class GetAverage {
    public double solution(int[] arr) {
        double answer = 0;
        for (int e : arr) {
        	answer += e;
        }
        return answer / arr.length;
    }
    public static void main(String[] args) {
		
	}
}
