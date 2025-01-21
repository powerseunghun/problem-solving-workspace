package Acmicpc.As.B2.TwentyThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PictureBroken20205 {
	static char[][] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		arr = new char[N][N];
		
		for (int i = 0; i < arr.length; i++) {
			str = br.readLine();
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = str.split(" ")[j].charAt(0);
			}
		}
		
		for (int i = 0; i < N*K; i++) {
			for (int j = 0; j < N*K; j++) {
				sb.append(arr[i/K][j/K]).append(" ");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
