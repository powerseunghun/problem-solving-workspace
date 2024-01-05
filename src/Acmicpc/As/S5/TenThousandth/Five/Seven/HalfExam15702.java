package Acmicpc.As.S5.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HalfExam15702 {
	static int[] stds = null, sc = null, res = null;
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), max = Integer.MIN_VALUE, maxStd = 0;
		stds = new int[M];
		sc = new int[N];
		arr = new char[M][N];
		res = new int[M];
		
		str = br.readLine();
		for (int i = 0; i < sc.length; i++) {
			sc[i] = Integer.parseInt(str.split(" ")[i]);
		}
		
		for (int i = 0; i < M; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length+1; j++) {
				if (j == 0) {
					stds[i] = Integer.parseInt(str.split(" ")[j]);
					continue;
				}
				arr[i][j-1] = str.split(" ")[j].charAt(0);
			}
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 'O') {
					res[i] += sc[j];
				}
			}
		}
		for (int i = 0; i < res.length; i++) {
			if (res[i] >= max) {
				if (res[i] == max) {
					if (stds[i] < maxStd) {
						max = res[i];
						maxStd = stds[i];
					}
				}
				else {
					max = res[i];
					maxStd = stds[i];
				}
			}
		}
		
		System.out.println(maxStd + " " + max);
		br.close();
	}
}
