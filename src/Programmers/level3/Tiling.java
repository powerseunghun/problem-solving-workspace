package Programmers.level3;

import test.Solution;

public class Tiling {
	static int[] dp = new int[60001];
	static int get(int n) {
		if (dp[n] != 0) return dp[n];
		else return dp[n] = (get(n-2) + get(n-1)) % 1000000007;
	}
	static int solution(int n) {
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        
        return get(n);
    }
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}
}
