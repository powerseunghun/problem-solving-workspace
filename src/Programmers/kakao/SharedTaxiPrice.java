package Programmers.kakao;

import java.util.Arrays;

public class SharedTaxiPrice {
	static int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = Integer.MAX_VALUE;
        int[][] arr = new int[n+1][n+1];
        
        for (int i = 0; i < arr.length; i++) {
        	Arrays.fill(arr[i], 200 * 100001);
        }
        for (int i = 1; i < arr.length; i++) {
        	arr[i][i] = 0;
        }
        for (int i = 0, c = 0, d = 0, f = 0; i < fares.length; i++) {
        	c = fares[i][0];
        	d = fares[i][1];
        	f = fares[i][2];
        	
        	arr[c][d] = f;
        	arr[d][c] = f;
        }
        
        for (int k = 1; k < arr.length; k++) {
        	for (int i = 1; i < arr.length; i++) {
        		for (int j = 1; j < arr.length; j++) {
        			if (arr[i][j] > arr[i][k] + arr[k][j]) {
        				arr[i][j] = arr[i][k] + arr[k][j];
        			}
        		}
        	}
        }
//        for (int i = 1; i < arr.length; i++) {
//        	for (int j = 1; j < arr[i].length; j++) {
//        		System.out.print(arr[i][j] + " ");
//        	}
//        	System.out.println();
//        }
        answer = Math.min(answer, arr[s][a]+arr[s][b]);
        for (int i = 1; i < arr.length; i++) {
        	answer = Math.min(answer, arr[s][i] + arr[i][a] + arr[i][b]);
        }
        return answer;
    }
	public static void main(String[] args) {
		int n = 6, s = 4, a = 5, b = 6;
//		int[][] fares = {{4,1,10}, {3,5,24}, {5,6,2}, {3,1,41}, {5,1,24}, {4,6,50}, {2,4,66}, {2,3,22}, {1,6,25}};
		int[][] fares = {{2,6,6},{6,3,7},{4,6,7},{6,5,11},{2,5,12},{5,3,20},{2,4,8},{4,3,9}};
		System.out.println(solution(n, s, a, b, fares));
		
	}
}
