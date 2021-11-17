package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

class Loc {
	private int x;
	private int y;
	private List<String> pathList;
	public Loc() {
		this.x = 0;
		this.y = 0;
		this.pathList = new ArrayList<>();
	}
	public Loc(int x, int y, List<String> pathList) {
		this.x = x;
		this.y = y;
		this.pathList = new ArrayList<>();
		for (int i = 0; i < pathList.size(); i++) {
			this.pathList.add(pathList.get(i));
		}
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
	public List<String> getPathList() {
		return pathList;
	}
	public void setPathList(List<String> pathList) {
		this.pathList = pathList;
	}
}
public class FindMazePath {
	static int[][] arr = null;
	static int[][] path = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void bfs(int x, int y) {
		Queue<Loc> q = new LinkedList<>();
		
		q.add(new Loc(x, y, new ArrayList<>()));
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			
			List<String> tmpPathList = tmp.getPathList();
			tmpPathList.add(tmp.getX() + " " + tmp.getY());
			
			if (tmp.getX() == arr.length-1 && tmp.getY() == arr[tmp.getX()].length-1) {
				for (int i = 0, pathX = 0, pathY = 0; i < tmpPathList.size(); i++) {
					pathX = Integer.parseInt(tmpPathList.get(i).split(" ")[0]);
					pathY = Integer.parseInt(tmpPathList.get(i).split(" ")[1]);
					path[pathX][pathY] = 1;
				}
				break;
			}
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == 1 && !check[nx][ny]) q.add(new Loc(nx, ny, tmpPathList));
			}
		}
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		arr = new int[4][4];
		path = new int[4][4];
		check = new boolean[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		bfs(0, 0);
		
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path[i].length; j++) {
				sb.append(" " + path[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
