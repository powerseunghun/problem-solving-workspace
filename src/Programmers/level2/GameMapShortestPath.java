package Programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

class Loc {
	private int x;
	private int y;
	private int move;
	
	public Loc(int x, int y, int m) {
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
public class GameMapShortestPath {
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int solution(int[][] maps) {
        int answer = Integer.MAX_VALUE, goalX = maps.length-1, goalY = maps[0].length-1;
        check = new boolean[maps.length][maps[0].length];
        
        Queue<Loc> q = new LinkedList<>();
        q.add(new Loc(0, 0, 1));
        check[0][0] = true;
        
        while (!q.isEmpty()) {
        	Loc tmp = q.poll();
        	
        	if (tmp.getX() == goalX && tmp.getY() == goalY) {
        		answer = Math.min(answer, tmp.getMove());
        		continue;
        	}
        	
        	for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
        		nx = tmp.getX() + dirX[i];
        		ny = tmp.getY() + dirY[i];
        		if (nx < 0 || ny < 0 || nx > maps.length-1 || ny > maps[nx].length-1) continue;
        		if (!check[nx][ny] && maps[nx][ny] == 1) {
        			check[nx][ny] = true;
        			q.add(new Loc(nx, ny, tmp.getMove() + 1));
        		}
        	}
        }
        
        return answer == Integer.MAX_VALUE ? -1 : answer;
    }
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
//		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}};
		System.out.println(solution(maps));
	}
}
