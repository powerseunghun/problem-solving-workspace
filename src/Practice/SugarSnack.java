package Practice;

import java.util.Scanner;

public class SugarSnack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] board = new int[sc.nextInt() + 2][sc.nextInt() + 2];
		int n = sc.nextInt(), l = 0, d = 0, x = 0, y = 0;
		
		for (int i = 0; i < n; i++) {
			l = sc.nextInt(); d = sc.nextInt(); x = sc.nextInt(); y = sc.nextInt();
			
			switch(d) {
			case 0:
				for (int j = 0; j < l; j++) {
					board[x][y++] = 1;
				}
				break;
			case 1:
				for (int j = 0; j < l; j++) {
					board[x++][y] = 1;
				}
				break;
			}
		}
		
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[i].length - 1; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
