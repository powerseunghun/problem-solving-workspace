package Acmicpc.As.B3.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChaseBoardPiece3004 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 1, w = 1;
		
		for (int i = 0; i < N; i++) {
			w += i % 2 != 0 ? 1 : 0;
			res += w;
		}
		
		System.out.println(res);
		br.close();
	}
}
