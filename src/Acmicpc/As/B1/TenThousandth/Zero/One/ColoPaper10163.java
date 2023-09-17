package Acmicpc.As.B1.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColoPaper10163 {
	static int[] res = null;
	static int[][] arr = new int[1001][1001];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), x = 0, y = 0, w = 0, h = 0;
		String str = null;
		res = new int[N+1];
		
		for (int a = 1; a <= N; a++) {
			str = br.readLine();
			x = Integer.parseInt(str.split(" ")[0]);
			y = Integer.parseInt(str.split(" ")[1]);
			w = Integer.parseInt(str.split(" ")[2]);
			h = Integer.parseInt(str.split(" ")[3]);
			
			for (int i = x; i < x+w; i++) {
				for (int j = y; j < y+h; j++) {
					arr[i][j] = a;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				res[arr[i][j]]++;
			}
		}
		
		for (int i = 1; i < res.length; i++) {
			sb.append(res[i]).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
