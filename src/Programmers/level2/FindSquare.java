package Programmers.level2;

public class FindSquare {
	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a%b);
	}
	static long solution(int w, int h) {
        int gcd = GCD(w, h);
        long answer = (long)w * (long)h;
        answer -= (((long)w / gcd) + ((long)h / gcd)-1) * gcd;
        
        return answer;
    }
	public static void main(String[] args) {
		int w = 8, h = 12;
		
		System.out.println(solution(w, h));
	}
}
