package Acmicpc.As.B1.TenThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bought18229 {
	static int[][] arr = null;
	static int[] res = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int M = Integer.parseInt(str.split(" ")[1]);
		int limit = Integer.parseInt(str.split(" ")[2]), x = 0, y = 0;
		arr = new int[N][M];
		res = new int[N];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println("i : " + i + ", j : " + j);
				res[j] += arr[j][i];
				if (res[j] > limit) {
					x = i+1;
					y = j+1;
					i = arr[0].length+1;
					break;
				}
			}
		}
		
		System.out.println(x + " " + y);
		br.close();
	}
}
