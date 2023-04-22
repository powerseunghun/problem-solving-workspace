package Acmicpc.As.B3.TenThousandth.Five.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zealous15784 {
	static int[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int a = Integer.parseInt(str.split(" ")[1])-1;
		int b = Integer.parseInt(str.split(" ")[2])-1, max = Integer.MIN_VALUE;
		arr = new int[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
				if (i == a || j == b) {
					max = Math.max(max, arr[i][j]);
				}
			}
		}
		
		System.out.println(arr[a][b] == max ? "HAPPY" : "ANGRY");
		br.close();
	}
}
