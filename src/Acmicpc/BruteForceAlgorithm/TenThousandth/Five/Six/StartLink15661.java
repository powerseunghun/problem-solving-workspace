package Acmicpc.BruteForceAlgorithm.TenThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StartLink15661 {
	static int[][] arr = null;
	static boolean[] check = null;
	static int minDiff = Integer.MAX_VALUE;
	static int N = 0, M = 0;
	static void bt(int d, int st) {
		if (d >= M) {
			int startSum = 0;
			int linkSum = 0;
			for (int i = 0; i < N-1; i++) {
				for (int j = i+1; j < N; j++) {
					if (check[i] && check[j]) {
						startSum += arr[i][j] + arr[j][i];
					}
					if (!check[i] && !check[j]) {
						linkSum += arr[i][j] + arr[j][i];
					}
				}
			}
			minDiff = Math.min(minDiff, Math.abs(startSum - linkSum));
			return;
		}
		for (int i = st; i < N; i++) {
			check[i] = true;
			bt(d+1, i+1);
			check[i] =false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		N = Integer.parseInt(br.readLine());
		check = new boolean[N];
		arr = new int[N][N];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for (M = 1; M < N; M++) {
			bt(0, 0);
		}
		System.out.println(minDiff);
	}
}
