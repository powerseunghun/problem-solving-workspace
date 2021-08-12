package Acmicpc.BruteForceAlgorithm.TenThousandth.Eight.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MineCraft18111 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = null;
		String tmp = br.readLine();
		StringTokenizer st = null;
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int B = Integer.parseInt(tmp.split(" ")[2]);
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sec = 0, height = 0;
		
		arr = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0, val = 0; j < M; j++) {
				val = Integer.parseInt(st.nextToken());
				arr[i][j] = val;
				max = Math.max(max, val);
				min = Math.min(min, val);
			}
		}
		sec = Integer.MAX_VALUE;
		height = -1;
		
		for (int i = min, s = 0, iv = B; i <= max; i++, s = 0, iv = B) {
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0, diff = 0; k < arr[j].length; k++) {
					diff = arr[j][k]-i;
					if (diff > 0) {
						s += Math.abs(diff)*2;
						iv += Math.abs(diff);
					}
					else if (diff < 0) {
						s += Math.abs(diff);
						iv -= Math.abs(diff);
					}
				}
			}
			if (iv >= 0) {
				if (s <= sec) {
					sec = s;
					height = i;
				}
			}
		}
		System.out.println(sec + " " + height);
	}
}
