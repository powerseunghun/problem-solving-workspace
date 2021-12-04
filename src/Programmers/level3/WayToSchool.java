package Programmers.level3;

public class WayToSchool {
	static int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];
        
        for (int i = 0; i < puddles.length; i++) {
        	dp[puddles[i][1]-1][puddles[i][0]-1] = -1;
        }
        
        dp[0][0] = 1;
//        for (int i = 1; i < m; i++) {
//        	if (dp[0][i] == -1) break;
//        	dp[0][i] += dp[0][i-1];
//        }
//        for (int i = 1; i < n; i++) {
//        	if (dp[i][0] == -1) continue;
//        	dp[i][0] += dp[i-1][0];
//        }
        
//        for (int i = 1; i < n; i++) {
//        	for (int j = 1; j < m; j++) {
//        		if (dp[i][j] == -1) {
//        			dp[i][j] = 0;
//        			continue;
//        		}
//        		dp[i][j] = (dp[i-1][j]+dp[i][j-1]) % 1000000007;
//        	}
//        }
        for (int i = 0; i < n; i++) {
        	for (int j = 0; j < m; j++) {
        		if (dp[i][j] == -1) {
        			dp[i][j] = 0;
        			continue;
        		}
        		
        		if (i != 0) dp[i][j] += dp[i-1][j] % 1000000007;
        		if (j != 0) dp[i][j] += dp[i][j-1] % 1000000007;
        	}
        }
        
//        for (int i = 0; i < dp.length; i++) {
//        	for (int j = 0; j < dp[i].length; j++) {
//        		System.out.print(dp[i][j] + " ");
//        	}
//        	System.out.println();
//        }
        
        return dp[n-1][m-1]%1000000007;
    }
	public static void main(String[] args) {
		int[][] puddles = {{2,2}};
		System.out.println(solution(4, 3, puddles));
	}
}
