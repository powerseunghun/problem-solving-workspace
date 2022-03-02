package Acmicpc.OrderSubmit.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
	private int x;
	private int y;
	
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
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
}
public class CompetitiveContagion18405 {
	static int[][] arr = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean validCheck(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) {
			return false;
		}
		if (arr[nx][ny] != 0) return false;
		return true;
	}
	static void bfs(int n) {
		Queue<Node> q = new LinkedList<Node>();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == n) q.add(new Node(i, j));
			}
		}
		
		while (!q.isEmpty()) {
			Node tmp = q.poll();
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (!validCheck(nx, ny)) continue;
				arr[nx][ny] = n;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		int S = 0, X = 0, Y = 0;
		
		arr = new int[N][N];
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		tmp = br.readLine();
		S = Integer.parseInt(tmp.split(" ")[0]);
		X = Integer.parseInt(tmp.split(" ")[1]);
		Y = Integer.parseInt(tmp.split(" ")[2]);
		
		for (int i = 0; i < S; i++) {
			for (int j = 0; j < K; j++) {
				bfs(j+1);
				if (arr[X-1][Y-1] != 0) {
					i = S+1;
					break;
				}
			}
		}
		
		System.out.println(arr[X-1][Y-1]);
		br.close();
	}
}
