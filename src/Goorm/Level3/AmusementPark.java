package Goorm.Level3;

import java.util.Scanner;


public class AmusementPark {
	public static final Scanner scanner = new Scanner(System.in);
	
	public static void testCase(int caseIndex) {
		int N = scanner.nextInt();  // 지도의 크기 
		int K = scanner.nextInt();  // 놀이공원의 크기
		
		int[][] wastes = new int[N][N]; // 각 칸의 쓰레기 존재 여부 
		for (int r = 0; r < N; r += 1) {
			for (int c = 0; c < N; c += 1) {
				wastes[r][c] = scanner.nextInt();
			}
		}
		
		
		
		int answer = Integer.MAX_VALUE, count = 0;
		for (int i = 0; i < wastes.length-K+1; i++) {
			for (int j = 0; j < wastes[i].length-K+1; j++) {
				count = 0;
				for (int k = i; k < i+K; k++) {
					for (int l = j; l < j+K; l++) {
						if (wastes[k][l] != 0) count+= wastes[k][l];
					}
				}
				answer = Math.min(answer, count);
			}
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) throws Exception {
		int caseSize = scanner.nextInt();
		
		for (int caseIndex = 1; caseIndex <= caseSize; caseIndex += 1) {
			testCase(caseIndex);
		}
		
	}
	
}