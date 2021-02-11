package Programmers.level1;

public class HarshadNumber {
	public boolean solution(int x) {
        boolean answer = true;
        int sum = 0, tmp = x;
        while (tmp != 0) {
        	sum += tmp % 10;
        	tmp /= 10;
        }
        answer = x % sum == 0 ? true : false;
        
        return answer;
    }
	public static void main(String[] args) {
		
	}
}
