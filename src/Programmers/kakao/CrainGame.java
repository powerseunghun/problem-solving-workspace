package Programmers.kakao;

import java.util.Stack;

public class CrainGame {
	public int solution(int[][] board, int[] moves) {
        int answer = 0, item = 0;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
        	for (int j = 0; j < board.length; j++) {
        		item = board[j][moves[i] - 1];
        		if (item != 0) {
        			st.push(item);
        			board[j][moves[i] - 1] = 0;
        			if (st.size() > 1) {
        				if (st.get(st.size() - 2) == item) {
        					st.remove(st.size()-1);
        					st.remove(st.size()-1);
        					answer += 2;
        				}
        			}
        			break;
        		}
        	}
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] board = {
				{0, 0, 0, 0, 0},
				{0, 0, 1, 0, 3},
				{0, 2, 5, 0, 1},
				{4, 2, 4, 4, 2},
				{3, 5, 1, 3, 1}
		};
		int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		System.out.println(new CrainGame().solution(board, moves));
		
		
//		Stack<Integer> st = new Stack<>();
//		st.push(5);
//		st.push(3);
//		st.push(2);
//		System.out.println(st);
//		System.out.println(st.get(st.size() - 1));
//		st.remove(st.size()-1);
//		System.out.println(st);
//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board[i].length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		
		int move = 1;
		for (int i = 0; i < board.length; i++) {
//			if (board[i][move - 1])
//			System.out.println(board[i][move - 1]);
		}
	}
}
