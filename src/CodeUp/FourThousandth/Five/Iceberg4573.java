package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Iceberg4573 {
	static int[][] arr = null, tmpArr = null;
	static int N = 0, M = 0, count = 0;
	static int check(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= M) return 0;
		if (arr[x][y] == 0) return 1;
		else return 0;
	}
	static void meltingCheck() {
		int[][] meltArr = new int[N][M];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] != 0) {
					int melt = check(i, j-1) + check(i-1, j) + check(i, j+1) + check(i+1, j);
					meltArr[i][j] = melt;
				}
			}
		}
		for (int i = 0; i < meltArr.length; i++) {
			for (int j = 0; j < meltArr[i].length; j++) {
				if (meltArr[i][j] != 0) {
					arr[i][j] -= meltArr[i][j];
					if (arr[i][j] < 0) arr[i][j] = 0;
				}
			}
		}
		return;
	}
	static void divideCheck(int x, int y) {
		if (x < 0 || y < 0 || x >= N || y >= M) return;
		if (tmpArr[x][y] == 0) return;
		
		tmpArr[x][y] = 0;
		divideCheck(x, y+1);
		divideCheck(x+1, y);
		divideCheck(x, y-1);
		divideCheck(x-1, y);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		N = Integer.parseInt(tmp.split(" ")[0]);
		M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		tmpArr = new int[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (int i = 1; i< 5 ; i++) {
			meltingCheck();
			for (int a = 0; a < arr.length; a++) {
				tmpArr[a] = arr[a].clone();
			}
			count = 0;
			for (int j = 0; j < tmpArr.length; j++) {
				for (int k = 0; k < tmpArr[j].length; k++) {
					if (tmpArr[j][k] != 0) {
						count++;
						divideCheck(j, k);
					}
				}
			}
			if (count >= 2) {
				System.out.println(i);
				return;
			}
		}
	}
}