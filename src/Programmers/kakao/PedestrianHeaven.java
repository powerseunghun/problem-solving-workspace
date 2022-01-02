package Programmers.kakao;

public class PedestrianHeaven {
	static final int MOD = 20170805;
	static int solution(int m, int n, int[][] cityMap) {
        int answer = 0;
        int[][][] dp = new int[m+1][n+1][2];
        dp[1][1][0] = 1;
        dp[1][1][1] = 1;
        
        // 0 down, 1 right
        for (int i = 1; i <= cityMap.length; i++) {
        	for (int j = 1; j <= cityMap[0].length; j++) {
        		switch(cityMap[i-1][j-1]) {
        		case 0:
        			dp[i][j][0] += (dp[i-1][j][0] + dp[i][j-1][1]) % MOD;
        			dp[i][j][1] += (dp[i-1][j][0] + dp[i][j-1][1]) % MOD;
        			break;
        		case 1:
        			dp[i][j][0] = dp[i][j][1] = 0;
        			break;
        		case 2:
        			dp[i][j][0] = dp[i-1][j][0];
        			dp[i][j][1] = dp[i][j-1][1];
        			break;
        		}
        	}
        }
        answer = dp[cityMap.length][cityMap[0].length][0];
        
        return answer;
    }
	public static void main(String[] args) {
//		int[][] cityMap = {{0,0,0},{0,0,0},{0,0,0}};
		int[][] cityMap = {{0,2,0,0,0,2},{0,0,2,0,1,0},{1,0,0,2,2,0}};
//		int m = 3, n = 3;
		int m = 3, n = 6;
		
		System.out.println(solution(m, n, cityMap));
	}
}
