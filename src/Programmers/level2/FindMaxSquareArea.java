package Programmers.level2;

public class FindMaxSquareArea {
	static int solution(int [][]board) {
        int answer = Integer.MIN_VALUE;
        int[][] dp = new int[board.length][board[0].length];
        dp[0] = board[0].clone();
        
        for (int i = 0; i < board.length; i++) {
        	dp[i][0] = board[i][0];
        }
        for (int i = 1; i < dp.length; i++) {
        	for (int j = 1; j < dp[i].length; j++) {
        		if (board[i][j] != 0) {
        			dp[i][j] = Math.min(Math.min(dp[i][j-1], dp[i-1][j]), dp[i-1][j-1]) + 1;
        		}
        	}
        }
        
        for (int i = 0; i < dp.length; i++) {
        	for (int j = 0; j < dp[i].length; j++) {
        		answer = Math.max(answer, dp[i][j]);
        	}
        }
        
        return (int)Math.pow(answer, 2);
    }
	public static void main(String[] args) {
//		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		int[][] board = {{0},{0},{0}};
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(solution(board));
	}
}
