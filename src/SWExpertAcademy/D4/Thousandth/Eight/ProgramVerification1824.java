package SWExpertAcademy.D4.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Loc {
	private int x;
	private int y;
	private int m;
	private char dir;
	public Loc(int x, int y, int m, char d) {
		this.x = x;
		this.y = y;
		this.m = m;
		this.dir = d;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public void setM(int m) {
		this.m = m;
	}
	public int getM() {
		return this.m;
	}
	public void setDir(char d) {
		this.dir = d;
	}
	public char getDir() {
		return this.dir;
	}
}

public class ProgramVerification1824 {
	static char[][] arr = null;
	static Set<String> set = new HashSet<>();
	static int[] dirX = { 0, -1, 0, 1 };
	static int[] dirY = { -1, 0, 1, 0 };
	static boolean flag = false;
	static boolean checkLoc(int nx, int ny) {
		if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) return false;
		return true;
	}
	static void bfs(int x, int y) {
		Queue<Loc> q = new LinkedList<>();
		q.add(new Loc(x, y, 0, 'r'));
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			int cx = tmp.getX();
			int cy = tmp.getY();
			int cm = tmp.getM();
			char cDir = tmp.getDir();
			String cmd = cx + "" + cy + "" + cm + "" + cDir;
			if (set.contains(cmd)) {
				return;
			}
			set.add(cmd);
			
			if (arr[cx][cy] >= '0' && arr[cx][cy] <= '9') {
				cm = (arr[cx][cy] - '0');
			}
			else {
				switch(arr[cx][cy]) {
				case '>':
					cDir = 'r';
					break;
				case '<':
					cDir = 'l';
					break;
				case '^':
					cDir = 'u';
					break;
				case 'v':
					cDir = 'd';
					break;
				case '-':
					cm--;
					if (cm < 0) cm = 15;
					break;
				case '+':
					cm++;
					if (cm > 15) cm = 0;
					break;
				case '_':
					cDir = cm == 0 ? 'r' : 'l';
					break;
				case '|':
					cDir = cm == 0 ? 'd' : 'u';
				case '?':
					cDir = '?';
					break;
				case '@':
					flag = true;
					return;
				}
			}
			int nx = 0, ny = 0;
			switch(cDir) {
			case 'l':
				nx = cx;
				ny = cy-1;
				if (checkLoc(nx, ny)) {
					q.add(new Loc(nx, ny, cm, cDir));
				}
				break;
			case 'r':
				nx = cx;
				ny = cy+1;
				if (checkLoc(nx, ny)) {
					q.add(new Loc(nx, ny, cm, cDir));
				}
				break;
			case 'u':
				nx = cx-1;
				ny = cy;
				if (checkLoc(nx, ny)) {
					q.add(new Loc(nx, ny, cm, cDir));
				}
				break;
			case 'd':
				nx = cx+1;
				ny = cy;
				if (checkLoc(nx, ny)) {
					q.add(new Loc(nx, ny, cm, cDir));
				}
				break;
			case '?':
				for (int i = 0; i < dirX.length; i++) {
					nx = cx + dirX[i];
					ny = cy + dirY[i];
					if (checkLoc(nx, ny)) {
						q.add(new Loc(nx, ny, cm, cDir));
					}
				}
				break;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine()), R = 0, C = 0;
		
		for (int i = 1; i <= T; i++) {
			set.clear();
			flag = false;
			tmp = br.readLine();
			R = Integer.parseInt(tmp.split(" ")[0]);
			C = Integer.parseInt(tmp.split(" ")[1]);
			arr = new char[R][C];
			for (int j = 0; j < arr.length; j++) {
				tmp = br.readLine();
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = tmp.charAt(k);
				}
			}
			bfs(0, 0);
			sb.append("#" + i + " " + (flag ? "YES" : "NO") + "\n");
		}
		System.out.print(sb.toString());
	}
}
