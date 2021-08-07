package Acmicpc.GreedyAlgorithm.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class RC {
	private int r;
	private int c;
	public RC() {
		this.r = 0;
		this.c = 0;
	}
	public RC(int r, int c) {
		this.r = r;
		this.c = c;
	}
	
	public int getR() {
		return this.r;
	}
	public int getC() {
		return this.c;
	}
}
public class PizzaBox14754 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), max = 0;
		long sum = 0;
		ArrayList<RC> list = new ArrayList<>();
		int[][] arr = new int[N][M], ans = new int[N][M];
		
		for (int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			max = 0;
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				max = Math.max(max, arr[i][j]);
			}
			for (int j = 0; j < arr[i].length; j++) {
				if (max == arr[i][j]) {
					list.add(new RC(i, j));
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			max = 0;
			for (int j = 0; j < N; j++) {
				max = Math.max(max, arr[j][i]);
			}
			for (int j = 0; j < N; j++) {
				if (arr[j][i] == max) {
					list.add(new RC(j, i));
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			arr[list.get(i).getR()][list.get(i).getC()] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
	}
}
