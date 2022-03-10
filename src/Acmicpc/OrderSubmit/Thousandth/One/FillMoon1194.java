package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Loc {
	private int x;
	private int y;
	private int t;
	public Loc(int x, int y, int t) {
		this.x = x;
		this.y = y;
		this.t = t;
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
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
}
public class FillMoon1194 {
	static char[][] arr = null;
	static boolean[][] check = null;
	static int startX = 0, startY = 0;
	static int goalX = 0, goalY = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int res = Integer.MAX_VALUE;
	static Map<Character, Integer> map = new HashMap<>();
	static void bfs() {
		Queue<Loc> q = new LinkedList<>();
		q.add(new Loc(startX, startY, 0));
		check[startX][startY] = true;
		
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			if (tmp.getX() == goalX && tmp.getY() == goalY) {
				res = Math.min(res, tmp.getT());
				continue;
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				
				// key
				if (arr[nx][ny] >= 'a' && arr[nx][ny] <= 'z') {
					if (!map.containsKey(arr[nx][ny])) {
						map.put(arr[nx][ny], 1);
					}
					else map.put(arr[nx][ny], map.get(arr[nx][ny])+1);
					q.add(new Loc(nx, ny, tmp.getT()+1));
				}
				// door
				else if (arr[nx][ny] == 'A' && arr[nx][ny] <= 'Z') {
					char key = (char)(arr[nx][ny] + 32);
					if (map.containsKey(key)) {
						int leftKey = map.get(key)-1;
						if (leftKey == 0) {
							map.remove(key);
						}
						else map.put(key, leftKey);
						q.add(new Loc(nx, ny, tmp.getT()+1));
					}
				}
				else if (arr[nx][ny] == '.') {
					q.add(new Loc(nx, ny, tmp.getT()+1));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new char[N][M];
		check = new boolean[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			tmp = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = tmp.charAt(j);
				if (arr[i][j] == '0') {
					startX = i;
					startY = j;
				}
				else if (arr[i][j] == '1') {
					goalX = i;
					goalY = j;
				}
			}
		}
		bfs();
		
		System.out.println(res == Integer.MAX_VALUE ? -1 : res);
		br.close();
	}
}
