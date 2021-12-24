package Programmers.level2;

public class ArrayMultiple {
	static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int i = 0; i < arr1.length; i++) {
        	for (int j = 0; j < arr2[0].length; j++) {
        		for (int k = 0; k < arr1[0].length; k++) {
        			answer[i][j] += arr1[i][k] * arr2[k][j];
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] arr1 = {{1,4},{3,2},{4,1}};
		int[][] arr2 = {{3,3},{3,3}};
		int[][] res = solution(arr1, arr2);
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.print(res[i][j] + " ");
			}
			System.out.println();
		}
	}
}
