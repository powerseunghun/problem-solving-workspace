package SWExpertAcademy.D4.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class ArrInfo implements Comparable<ArrInfo>{
	private int r;
	private int c;
	public ArrInfo(int r, int c) {
		this.r = r;
		this.c = c;
	}
	public int getR() {
		return this.r;
	}
	public int getC() {
		return this.c;
	}
	public int getSize() {
		return this.r * this.c;
	}
	@Override
	public int compareTo(ArrInfo o) {
		if (this.getSize() == o.getSize()) {
			return this.r - o.getR();
		}
		return this.getSize()-o.getSize();
	}
}
public class FindArray1258 {
	static int[][] arr = null;
	static boolean[][] check = null;
	static int minR = 0, maxR = 0, minC = 0, maxC = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static ArrayList<ArrInfo> list = new ArrayList<>();
	static void init(int N) {
		list.clear();
		arr = new int[N][N];
		check = new boolean[N][N];
	}
	static void rcInit() {
		minR = Integer.MAX_VALUE;
		maxR = Integer.MIN_VALUE;
		minC = Integer.MAX_VALUE;
		maxC = Integer.MIN_VALUE;
	}
	static void search(int x, int y) {
		arr[x][y] = 0;
		minR = Integer.min(minR, x);
		maxR = Integer.max(maxR, x);
		minC = Integer.min(minC, y);
		maxC = Integer.max(maxC, y);
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (!check[nx][ny] && arr[nx][ny] != 0) {
				check[nx][ny] = true;
				search(nx, ny);
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			init(N);
			for (int j = 0; j < arr.length; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < arr[j].length; k++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (arr[j][k] != 0) {
						rcInit();
						search(j, k);
						list.add(new ArrInfo(maxR-minR+1, maxC-minC+1));
					}
				}
			}
			Collections.sort(list);
			sb.append("#" + i + " " + list.size() + " ");
			for (int j = 0; j < list.size(); j++) {
				sb.append(list.get(j).getR() + " " + list.get(j).getC() + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	} 
}
