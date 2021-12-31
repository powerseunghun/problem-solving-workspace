package Programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class TrackConstruction2 {
	// dir0 = 왼쪽,  dir1 = 위쪽
	// dir2 = 오른쪽, dir3 = 아래쪽
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int[][] check = null;
	static int answer = Integer.MAX_VALUE;
	static boolean posCheck(int nx, int ny, int[][] board) {
		if (nx < 0 || ny < 0 || nx > board.length-1 || ny > board[nx].length-1) return false;
		if (board[nx][ny] == 1) return false;
		return true;
	}
	static void bfs(int[][] board, int dir) {
		Queue<Info> q = new LinkedList<>();
		
		q.add(new Info(0, 0, dir, 0));
		check[0][0] = 1;
		check[board.length-1][board.length-1] = 0;
		
		while (!q.isEmpty()) {
			Info tmp = q.poll();
			
			if (tmp.getX() == board.length-1 && tmp.getY() == board.length-1) {
				int x = tmp.getX();
				int y = tmp.getY();
				check[x][y] = Math.min(check[x][y], tmp.getPrice());
				answer = Math.min(answer, tmp.getPrice());
				continue;
			}
			
			for (int i = 0, nx = 0, ny = 0, newPrice = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (!posCheck(nx, ny, board)) continue;
				
				if (tmp.getDir() == -1) {
					newPrice = tmp.getPrice()+100;
				}
				else {
					int beforeDir = tmp.getDir();
					switch(i) {
					case 0: case 2:
						if (beforeDir == 0 || beforeDir == 2) newPrice = tmp.getPrice()+100;
						else newPrice = tmp.getPrice()+600;
						break;
					case 1: case 3:
						if (beforeDir == 1 || beforeDir == 3) newPrice = tmp.getPrice()+100;
						else newPrice = tmp.getPrice()+600;
						break;
					}
				}
				
				if (check[nx][ny] == 0 || (check[nx][ny] >= newPrice)) {
					q.add(new Info(nx, ny, i, newPrice));
					check[nx][ny] = newPrice;
				}
			}
		}
	}
	static int solution(int[][] board) {
		for (int i = 2; i <= 3; i++) {
			check = new int[board.length][board[0].length];
			bfs(board, i);
		}
        return answer;
    }
	public static void main(String[] args) {
//		int[][] board = {{0,0,0}, {0,0,0}, {0,0,0}};
//		int[][] board = {{0,0,0,0,0,0,0,1},{0,0,0,0,0,0,0,0},{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,0},{0,0,0,1,0,0,0,1},{0,0,1,0,0,0,1,0},{0,1,0,0,0,1,0,0},{1,0,0,0,0,0,0,0}};
//		int[][] board = {{0,0,1,0}, {0,0,0,0}, {0,1,0,1}, {1,0,0,0}};
//		int[][] board = {{0,0,0,0,0,0,0,0}, {1,0,1,1,1,1,1,0}, {1,0,0,1,0,0,0,0}, {1,1,0,0,0,1,1,1}, {1,1,1,1,0,0,0,0}, {1,1,1,1,1,1,1,0}, {1,1,1,1,1,1,1,0}, {1,1,1,1,1,1,1,0}};
		int[][] board = {{0,0,0,0,0},{0,1,1,1,0},{0,0,1,0,0},{1,0,0,0,1},{0,1,1,0,0}};
		
		System.out.println(solution(board));
	}
}
