package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixMultiplication2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]), K = 0;
		int[][] mat1 = new int[N][M], mat2 = null, mat3 = null;
		
		for (int i = 0; i < mat1.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		tmp = br.readLine();
		M = Integer.parseInt(tmp.split(" ")[0]);
		K = Integer.parseInt(tmp.split(" ")[1]);
		mat2 = new int[M][K];
		mat3 = new int[N][K];
		
		for (int i = 0; i < mat2.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < mat2[i].length; j++) {
				mat2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < M; k++) {
					mat3[i][j] += mat1[i][k] * mat2[k][j];
				}
				sb.append(mat3[i][j] + " ");
			}
			sb.append("\n");
		}
		
		System.out.println(sb); 
//		for (int i = 0; i < mat3.length; i++) {
//			for (int j = 0; j < mat3[i].length; j++) {
//				System.out.print(mat3[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < mat1.length; i++) {
//			for (int j = 0; j < mat1[i].length; j++) {
//				System.out.print(mat1[i][j] + " ");
//			}
//			System.out.println();
//		}
//		for (int i = 0; i < mat2.length; i++) {
//			for (int j = 0; j < mat2[i].length; j++) {
//				System.out.print(mat2[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
