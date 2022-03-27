package Acmicpc.OrderSubmit.TenThousandth.Two.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StoneGroup12886 {
	static boolean[][] check = new boolean[1501][1501];
	static boolean flag = false;
	static void func(int A, int B, int C) {
		int X = Math.min(A, B);
		int Y = Math.max(A, B);
		
		if (!check[X+X][Y-X]) {
			check[X+X][Y-X] = true;
			dfs(X+X, Y-X, C);
		}
	}
	static void dfs(int A, int B, int C) {
		if (A == B && B == C) {
			flag = true;
			return;
		}
		func(A, B, C);
		func(A, C, B);
		func(B, C, A);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		int C = Integer.parseInt(tmp.split(" ")[2]);
		
		if ((A+B+C) % 3 != 0) {
			System.out.println("0");
			return;
		}
		dfs(A, B, C);
		
		System.out.println(flag ? "1" : "0");
		br.close();
	}
}
