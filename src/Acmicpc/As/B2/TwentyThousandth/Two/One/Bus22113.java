package Acmicpc.As.B2.TwentyThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bus22113 {
	static int[][] arr = null;
	static int[] v = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]), res = 0;
		arr = new int[N][N];
		v = new int[M];
		
		str = br.readLine();
		for (int i = 0; i < str.split(" ").length; i++) {
			v[i] = Integer.parseInt(str.split(" ")[i]);
			v[i]--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		for (int i = 1; i < M; i++) {
			res += arr[v[i-1]][v[i]];
		}
		
		System.out.println(res);
		br.close();
	}
}
