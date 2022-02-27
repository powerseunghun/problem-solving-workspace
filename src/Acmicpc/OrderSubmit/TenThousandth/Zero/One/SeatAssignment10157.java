package Acmicpc.OrderSubmit.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SeatAssignment10157 {
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static boolean[][] check = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int C = Integer.parseInt(tmp.split(" ")[0]);
		int R = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(br.readLine());
		int count = 1, x = R-1, y = 0, dir = 0;
		check = new boolean[R][C];
		
		if (C*R < K) {
			System.out.println("0");
			return;
		}
		for (int nx = 0, ny = 0; count < K; count++) {
			check[x][y] = true;
			nx = x + dirX[dir];
			ny = y + dirY[dir];
			
			if (nx < 0 || ny < 0 || nx >= R || ny >= C || check[nx][ny]) {
				dir = (dir+1) % 4;
				nx = x + dirX[dir];
				ny = y + dirY[dir];
			}
			x = nx;
			y = ny;
		}
		
		System.out.println((y+1) + " " + (R-x));
		br.close();
	}
}
