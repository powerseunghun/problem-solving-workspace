package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Pos {
	private int x;
	private int y;
	public Pos(int x, int y) {
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
public class Problem5 {
	static char[][] arr = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int N = 0, M = 0;
	static void F(int X, int Y, char baseColor, char color) {
		arr[Y][X] = color;
		Queue<Pos> q = new LinkedList<>();
		q.add(new Pos(X, Y));
		
		while (!q.isEmpty()) {
			Pos tmp = q.poll();
			
			for (int i = 0, nx = 0, ny = 0; i < dirY.length; i++) {
				nx = tmp.getX() + dirY[i];
				ny = tmp.getY() + dirX[i];
				if (nx < 0 || ny < 0 || nx > M || ny > N) continue;
				if (arr[ny][nx] == baseColor) {
					arr[ny][nx] = color;
					q.add(new Pos(nx, ny));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		char c = ' ', color = ' ', baseColor = ' ';
		int X = 0, Y = 0, Y1 = 0, Y2 = 0, X1 = 0, X2 = 0;
		while (true) {
			tmp = br.readLine();
			c = tmp.charAt(0);
			if (c == 'X') break;
			switch(c) {
			case 'I':
				M = Integer.parseInt(tmp.split(" ")[1]);
				N = Integer.parseInt(tmp.split(" ")[2]);
				arr = new char[N+1][M+1];
				for (int i = 1; i < arr.length; i++) {
					Arrays.fill(arr[i], 'O');
				}
				break;
			case 'C':
				for (int i = 1; i < arr.length; i++) {
					Arrays.fill(arr[i], 'O');
				}
				break;
			case 'L':
				X = Integer.parseInt(tmp.split(" ")[1]);
				Y = Integer.parseInt(tmp.split(" ")[2]);
				arr[Y][X] = tmp.split(" ")[3].charAt(0);
				break;
			case 'V':
				X = Integer.parseInt(tmp.split(" ")[1]);
				Y1 = Integer.parseInt(tmp.split(" ")[2]);
				Y2 = Integer.parseInt(tmp.split(" ")[3]);
				color = tmp.split(" ")[4].charAt(0);
				for (int i = Y1; i <= Y2; i++) {
					arr[i][X] = color;
				}
				break;
			case 'H':
				X1 = Integer.parseInt(tmp.split(" ")[1]);
				X2 = Integer.parseInt(tmp.split(" ")[2]);
				Y = Integer.parseInt(tmp.split(" ")[3]);
				color = tmp.split(" ")[4].charAt(0);
				for (int i = X1; i <= X2; i++) {
					arr[Y][i] = color;
				}
				break;
			case 'K':
				X1 = Integer.parseInt(tmp.split(" ")[1]);
				X2 = Integer.parseInt(tmp.split(" ")[2]);
				Y1 = Integer.parseInt(tmp.split(" ")[3]);
				Y2 = Integer.parseInt(tmp.split(" ")[4]);
				for (int i = X1; i <= X2; i++) {
					for (int j = Y1; j <= Y2; j++) {
						System.out.print(arr[j][i] + " ");
					}
					System.out.println();
				}
				break;
			case 'F':
				X = Integer.parseInt(tmp.split(" ")[1]);
				Y = Integer.parseInt(tmp.split(" ")[2]);
				baseColor = arr[Y][X];
				color = tmp.split(" ")[3].charAt(0);
				F(X, Y, baseColor, color);
				break;
			case 'S':
				System.out.println(tmp.split(" ")[1]);
				for (int i = 1; i < arr.length; i++) {
					for (int j = 1; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}
