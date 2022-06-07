package Acmicpc.As.B5.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixSum2738 {
	static int[][] mat1 = null;
	static int[][] mat2 = null;
	static int[][] mat3 = null;
	static void init(int N, int M) {
		mat1 = new int[N][M];
		mat2 = new int[N][M];
		mat3 = new int[N][M];
	}
	static void calc() {
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		init(N, M);
		for (int t = 0; t < 2; t++) {
			for (int i = 0; i < N; i++) {
				tmp = br.readLine();
				for (int j = 0; j < M; j++) {
					if (t == 0) mat1[i][j] = Integer.parseInt(tmp.split(" ")[j]);
					else mat2[i][j] = Integer.parseInt(tmp.split(" ")[j]);
				}
			}
		}
		calc();
		
		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {
				sb.append(mat3[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
