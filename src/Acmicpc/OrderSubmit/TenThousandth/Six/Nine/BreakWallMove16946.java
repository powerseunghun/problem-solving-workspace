package Acmicpc.OrderSubmit.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class Loc {
	private int x;
	private int y;
	
	public Loc(int x, int y) {
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
public class BreakWallMove16946 {
	static int[][] arr = null;
	static int[][] resArr = null;
	static boolean[][] check = null;
	static Map<Integer, Integer> getGn = new HashMap<>();
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int count = 0;
	static void bfs(int x, int y, int gn) {
		Queue<Loc> q = new LinkedList<>();
		q.add(new Loc(x, y));
		check[x][y] = true;
		arr[x][y] = gn;
		
		while (!q.isEmpty()) {
			Loc tmp = q.poll();
			
			for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
				nx = tmp.getX() + dirX[i];
				ny = tmp.getY() + dirY[i];
				if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
				if (arr[nx][ny] == 0 && !check[nx][ny]) {
					count++;
					check[nx][ny] = true;
					arr[nx][ny] = gn;
					q.add(new Loc(nx, ny));
				}
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		Set<Integer> set = new HashSet<>();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), gn = 11;
		arr = new int[N][M];
		check = new boolean[N][M];
		resArr = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = tmp.charAt(j) - '0';
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0 && !check[i][j]) {
					count = 1;
					bfs(i, j, gn);
					getGn.put(gn++, count);
				}
			}
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				System.out.print(arr[i][j] + " "); 
//			}
//			System.out.println();
//		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > 10) continue;
				set.clear();
				
				for (int k = 0, nx = 0, ny = 0; k < dirX.length; k++) {
					nx = i + dirX[k];
					ny = j + dirY[k];
					if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
					if (arr[nx][ny] > 10) {
						set.add(arr[nx][ny]);
					}
				}
				for (int el : set) {
					resArr[i][j] += getGn.get(el);
				}
				resArr[i][j] += 1;
				resArr[i][j] %= 10;
			}
		}
		for (int i = 0; i < resArr.length; i++) {
			for (int j = 0; j < resArr[i].length; j++) {
				sb.append(resArr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
//		System.out.println("\n\n");
//		for (int i = 0; i < resArr.length; i++) {
//			for (int j = 0; j < resArr[i].length; j++) {
//				System.out.print(resArr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println("END");
		
//		for (int i = 11; i <= 16; i++) {
//			System.out.println(getGn.get(i));
//		}
	}
}
