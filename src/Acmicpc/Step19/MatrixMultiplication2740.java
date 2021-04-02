package Acmicpc.Step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixMultiplication2740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]), M = Integer.parseInt(tmp.split(" ")[1]), K = 0;
		int[][] mat1 = new int[N][M];
		
		for (int i = 0; i < mat1.length; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < mat1[i].length; j++) {
				mat1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		System.out.println(N);
		System.out.println(M);
	}
}
