package Acmicpc.As.B2.ThreeThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SangKeunChess3076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int R = Integer.parseInt(tmp.split(" ")[0]);
		int C = Integer.parseInt(tmp.split(" ")[1]);
		tmp = br.readLine();
		int A = Integer.parseInt(tmp.split(" ")[0]);
		int B = Integer.parseInt(tmp.split(" ")[1]);
		
		// R = 2, C = 4;
		// A = 2, B = 2;
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < A; j++) {
				for (int k = 0; k < C; k++) {
					for (int l = 0; l < B; l++) {
						sb.append((i+k)%2 == 0 ? 'X' : '.'); 
					}
				}
				sb.append("\n");
			}
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
