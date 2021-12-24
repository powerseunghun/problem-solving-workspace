package Programmers.level2;

public class FibonacciNumber {
	static int[] mem = null;
	static int fibo(int n) {
		if (mem[n] != 0) return mem[n];
		if (n <= 1) return n;
		else return mem[n] = (fibo(n-2) + fibo(n-1)) % 1234567;
	}
	static int solution(int n) {
        int answer = 0;
        return answer;
    }
	public static void main(String[] args) {
		int n = 5;
		mem = new int[n+1];
		
		System.out.println(fibo(n));
	}
}
