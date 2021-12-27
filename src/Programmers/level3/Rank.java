package Programmers.level3;

import java.util.Arrays;

public class Rank {
	static int solution(int n, int[][] results) {
        int answer = 0;
        int[][] rank = new int[n+1][n+1];
		
		for (int i = 1; i < rank.length; i++) {
			Arrays.fill(rank[i], n*n+1);
		}
		
		for (int i = 0; i < results.length; i++) {
			rank[results[i][0]][results[i][1]] = 1;
		}
		
		for (int k = 1; k < rank.length; k++) {
			for (int i = 1; i < rank.length; i++) {
				for (int j = 1; j < rank.length; j++) {
					if (i == j) continue;
					if (rank[i][j] > rank[i][k] + rank[k][j]) {
						rank[i][j] = rank[i][k] + rank[k][j];
					}
				}
			}
		}
		
		for (int i = 1, count = 0; i < rank.length; i++, count = 0) {
			for (int j = 1; j < rank[i].length; j++) {
				if (i == j) continue;
				if (rank[i][j] == n*n+1 && rank[j][i] == n*n+1) {
					count++;
					break;
				}
			}
			if (count == 0) answer++;
		}
        return answer;
    }
	public static void main(String[] args) {
		int[][] results = {{4,3},{4,2},{3,2},{1,2},{2,5}};
		int n = 5;
		System.out.println(solution(n, results));
	}
}
