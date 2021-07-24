package Acmicpc.Implements.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteSpace1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = 0;
		char[][] board = new char[8][8];
		String tmp = null;
		for (int i = 0; i < board.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = tmp.charAt(j);
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				count = i % 2 == 0 
						? (j % 2 == 0 && board[i][j] == 'F') ? count+1 : count 
						: (j % 2 != 0 && board[i][j] == 'F') ? count+1 : count;
			}
		}
		System.out.println(count);
	}
}
