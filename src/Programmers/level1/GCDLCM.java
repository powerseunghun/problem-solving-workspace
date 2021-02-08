package Programmers.level1;

public class GCDLCM {
	public int getGCD(int n, int m) {
        if (m == 0) return n;
        else return getGCD(m, n % m);
    }
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = this.getGCD(n, m);
        answer[1] = (n * m) / answer[0];
        
        return answer;
    }
    
    public static void main(String[] args) {
		
	}
}
