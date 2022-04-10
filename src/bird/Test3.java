package bird;

import java.util.LinkedList;
import java.util.Queue;

public class Test3 {
	// 0 0 0 1
	// 0 0 1 1
	// 0 0 0 0
	// 1 1 1 0
	static int[][] arr = {{0,0,0,1},{0,0,1,1},{0,0,0,0},{1,1,1,0}};
	static boolean[][] check = new boolean[4][4];
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	// (0,0) -> (3, 3) 횟수
	static class Node {
		// location
		private int x;
		private int y;
		private int move;
		
		public Node(int x, int y, int m) {
			this.x = x;
			this.y = y;
			this.move = m;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getMove() {
			return move;
		}

		public void setMove(int move) {
			this.move = move;
		}
	}
	static int bfs() {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0, 0));
		check[0][0] = true;
		
		while (!q.isEmpty()) {
			Node tmp = q.poll();
			if (tmp.getX() == 3 && tmp.getY() == 3) {
				return tmp.getMove();
			}
			
			for (int i = 0, nx = 0, ny =0; i < dirX.length; i++) {
				nx = tmp.getX()+dirX[i];
				ny = tmp.getY()+dirY[i];
				if (nx < 0 || ny < 0 || nx > 3 || ny > 3) continue;
				if (arr[nx][ny] == 0) {
					q.add(new Node(nx, ny, tmp.getMove()+1));
					check[nx][ny] = true;
				}
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		System.out.println(bfs());
		for (int i = 0; i < check.length; i++) {
			for (int j = 0; j < check[i].length; j++) {
				System.out.print(check[i][j] ? 1 : 0);
			}
			System.out.println();
		}
	}
}
