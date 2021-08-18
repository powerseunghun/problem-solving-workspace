package Acmicpc.Tree.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeDiameter1967 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N+1][N+1];
		for (int i = 0, a = 0, b = 0, w = 0; i < N-1; i++) {
			tmp = br.readLine();
			a = Integer.parseInt(tmp.split(" ")[0]);
			b = Integer.parseInt(tmp.split(" ")[1]);
			w = Integer.parseInt(tmp.split(" ")[2]);
//			System.out.println("a : " + a + ", b : " + b + ", w : " + w);
			arr[a][b] = w;
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
