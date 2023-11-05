package Acmicpc.As.S5.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Invisible1531 {
	static final int size = 101;
	static int[][] arr = new int[size][size];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int a = 0, b = 0, c = 0, d = 0, res = 0;
		
		for (int t = 0; t < N; t++) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			c = Integer.parseInt(str.split(" ")[2]);
			d = Integer.parseInt(str.split(" ")[3]);
			for (int i = a; i <= c; i++) {
				for (int j = b; j <= d; j++) {
					arr[i][j]++;
				}
			}
		}
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr[i].length; j++) {
				res = arr[i][j] > M ? res+1 : res;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
