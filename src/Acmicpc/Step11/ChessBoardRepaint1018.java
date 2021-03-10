package Acmicpc.Step11;

import java.util.Scanner;

public class ChessBoardRepaint1018 {
	public int getCount(char[][] paramBoard, int baseCount) {
		int countWB = 0;
		int countBW = 0;
		char[][] WBBoard = {
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}
		};
		
		char[][] BWBoard = {
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
				{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
				{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}
		};
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (WBBoard[i][j] != paramBoard[i][j]) {
					countWB++;
				}
				if (BWBoard[i][j] != paramBoard[i][j]) {
					countBW++;
				}
			}
		}
		return (countWB >= countBW) ? 
				(countBW >= baseCount) ? baseCount : countBW : 
				(countWB >= baseCount) ? baseCount : countWB;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt(), N = sc.nextInt(), count = 65;
		char[][] chessBoard = new char[M][N];
		char[][] paramBoard = new char[M][N];
		
		ChessBoardRepaint1018 cbr = new ChessBoardRepaint1018();
		for (int i = 0; i < M; i++) {
			String tmp = sc.next();
			for (int j = 0; j < N; j++) {
				chessBoard[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i <= M - 8; i++) {
			for (int j = 0; j <= N - 8; j++) {
				// parambord 
				for (int x = 0; x < 8; x++) {
					for (int y= 0; y < 8; y++) {
						paramBoard[x][y] = chessBoard[x+i][y+j];
					}
				}
				count = cbr.getCount(paramBoard, count);
			}
		}
		System.out.println(count);
	}
}
