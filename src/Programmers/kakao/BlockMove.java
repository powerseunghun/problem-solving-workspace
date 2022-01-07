package Programmers.kakao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Robot {
	private int leftX;
	private int leftY;
	private int rightX;
	private int rightY;
	private int time;
	
	public Robot(int lx, int ly, int rx, int ry, int t) {
		this.leftX = lx;
		this.leftY = ly;
		this.rightX = rx;
		this.rightY = ry;
		this.time = t;
	}
	public int getLeftX() {
		return leftX;
	}
	public void setLeftX(int leftX) {
		this.leftX = leftX;
	}
	public int getLeftY() {
		return leftY;
	}
	public void setLeftY(int leftY) {
		this.leftY = leftY;
	}
	public int getRightX() {
		return rightX;
	}
	public void setRightX(int rightX) {
		this.rightX = rightX;
	}
	public int getRightY() {
		return rightY;
	}
	public void setRightY(int rightY) {
		this.rightY = rightY;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
}
public class BlockMove {
	static int goalX = 0;
	static int goalY = 0;
	static int answer = Integer.MAX_VALUE;
	static Map<String, Integer> checkMap = new HashMap<>();
	static boolean posCheck(int x, int y) {
		if (x < 1 || y < 1 || x > goalX || y > goalY) return false;
		return true;
	}
	static void moveCheck(Queue<Robot> q, Robot tmp, int[][] board) {
		for (int i = 0; i < 4; i++) {
			int newLeftX = 0, newLeftY = 0, newRightX = 0, newRightY = 0;
			switch(i) {
			// move to left
    		case 0:
    			newLeftX = tmp.getLeftX();
    			newLeftY = tmp.getLeftY()-1;
    			newRightX = tmp.getLeftX();
    			newRightY = tmp.getLeftY();
    			break;
			// move to up
    		case 1:
    			newLeftX = tmp.getLeftX()-1;
    			newLeftY = tmp.getLeftY();
    			newRightX = tmp.getRightX()-1;
    			newRightY = tmp.getRightY();
    			break;
			// move to right
    		case 2:
    			newLeftX = tmp.getRightX();
    			newLeftY = tmp.getRightY();
    			newRightX = tmp.getRightX();
    			newRightY = tmp.getRightY()+1;
    			break;
			// move to down
    		case 3:
    			newLeftX = tmp.getLeftX()+1;
    			newLeftY = tmp.getLeftY();
    			newRightX = tmp.getRightX()+1;
    			newRightY = tmp.getRightY();
    			break;
			}
			
			String locString1 = newLeftX + "" + newLeftY + "" + newRightX + "" + newRightY;
			String locString2 = newRightX + "" + newRightY + "" + newLeftX + "" + newLeftY;
			
			if (!posCheck(newLeftX, newLeftY) || !posCheck(newRightX, newRightY)) continue;
			if (checkMap.containsKey(locString1) || checkMap.containsKey(locString2)) continue;
			
			if (board[newLeftX][newLeftY] == 0 && board[newRightX][newRightY] == 0) {
				q.add(new Robot(newLeftX, newLeftY, newRightX, newRightY, tmp.getTime()+1));
				System.out.println("move add : " + newLeftX + ", " + newLeftY + ", " + newRightX + ", " + newRightY + " : " + (tmp.getTime()+1));
				if ((newLeftX == goalX && newLeftY == goalY) || (newRightX == goalX && newRightY == goalY)) continue;
				checkMap.put(locString1, 1);
				checkMap.put(locString2, 1);
			}
		}
	}
	static void lotateCheck(Queue<Robot> q, Robot tmp, int[][] board) {
		for (int i = 0; i < 4; i++) {
			int newLeftX = 0, newLeftY = 0, newRightX = 0, newRightY = 0;
			int lotateX = 0, lotateY = 0;
			switch(i) {
			// 왼다리 축으로 위로 이동
			case 0:
				lotateX = tmp.getLeftX()-1;
				lotateY = tmp.getLeftY()+1;
				newLeftX = tmp.getLeftX();
				newLeftY = tmp.getLeftY();
				newRightX = tmp.getLeftX()-1;
				newRightY = tmp.getLeftY();
				break;
			// 왼다리 축으로 아래로 이동
			case 1:
				lotateX = tmp.getLeftX()+1;
				lotateY = tmp.getLeftY()+1;
				newLeftX = tmp.getLeftX();
				newLeftY = tmp.getLeftY();
				newRightX = tmp.getLeftX()+1;
				newRightY = tmp.getLeftY();
				break;
			// 오른 다리 축으로 위로 회전
			case 2:
				lotateX = tmp.getRightX()-1;
				lotateY = tmp.getRightY()-1;
				newLeftX = tmp.getRightX()-1;
				newLeftY = tmp.getRightY();
				newRightX = tmp.getRightX();
				newRightY = tmp.getRightY();
				break;
			// 오른 다리 축으로 아래로 회전
			case 3:
				lotateX = tmp.getRightX()+1;
				lotateY = tmp.getRightY()-1;
				newLeftX = tmp.getRightX()+1;
				newLeftY = tmp.getRightY();
				newRightX = tmp.getRightX();
				newRightY = tmp.getRightY();
				break;
			}
			
			String locString1 = newLeftX + "" + newLeftY + "" + newRightX + "" + newRightY;
			String locString2 = newRightX + "" + newRightY + "" + newLeftX + "" + newLeftY;
			
			if (!posCheck(lotateX, lotateY) || !posCheck(newLeftX, newLeftY) || !posCheck(newRightX, newRightY)) continue;
			if (board[lotateX][lotateY] == 1) continue;
			if (checkMap.containsKey(locString1) || checkMap.containsKey(locString2)) continue;
			
			if (board[newLeftX][newLeftY] == 0 && board[newRightX][newRightY] == 0) {
				q.add(new Robot(newLeftX, newLeftY, newRightX, newRightY, tmp.getTime()+1));
				System.out.println("lotate add : " + newLeftX + ", " + newLeftY + ", " + newRightX + ", " + newRightY + " : " + (tmp.getTime()+1));
				if ((newLeftX == goalX && newLeftY == goalY) || (newRightX == goalX && newRightY == goalY)) continue;
				checkMap.put(locString1, 1);
				checkMap.put(locString2, 1);
			}
		}
	}
	static int solution(int[][] board) {
		// 상하좌우 이동
		// 각 다리를 축으로 위 아래 회전 회전 축 pos 체크
        goalX = board.length-2;
        goalY = board.length-2;
        
        Queue<Robot> q = new LinkedList<>();
        
        q.add(new Robot(1, 1, 1, 2, 0));
        checkMap.put("1112", 1);
        checkMap.put("1211", 1);
        
        while (!q.isEmpty()) {
        	Robot tmp = q.poll();
        	if ((tmp.getLeftX() == goalX && tmp.getLeftY() == goalY) || 
    			(tmp.getRightX() == goalX && tmp.getRightY() == goalY)) {
        		answer = Math.min(answer, tmp.getTime());
//        		System.out.println(tmp.getLeftX() + " " + tmp.getLeftY() + " " + tmp.getRightX() + " " + tmp.getRightY() + " : " + tmp.getTime());
        		continue;
        	}
        	moveCheck(q, tmp, board);
        	lotateCheck(q, tmp, board);
        }
        return answer;
    }
	public static void main(String[] args) {
		int[][] board = {{0,0,0,1,1},{0,0,0,1,0},{0,1,0,1,1},{1,1,0,0,1},{0,0,0,0,0}};
		int[][] myBoard = new int[board.length+2][board.length+2];
		for (int i = 1; i <= board.length; i++) {
			for (int j = 1; j <= board.length; j++) {
				myBoard[i][j] = board[i-1][j-1];
			}
		}
		
		System.out.println(solution(myBoard));
	}
}
