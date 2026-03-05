package Acmicpc.As.B2.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EcornerSystem34010 {
	static int[][] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		int N = Integer.parseInt(br.readLine());
		arr = new int[2*N-1][N];
		
		for (int i = 0; i < 2*N-1; i++) {
			str = br.readLine();
			for (int j = 0; j<N-1+(i&1); j++) {
				arr[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		
		System.out.println((2*N-2) + " " + (2*N-3));
		br.close();
	}
}
