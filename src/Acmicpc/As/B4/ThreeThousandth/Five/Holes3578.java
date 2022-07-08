package Acmicpc.As.B4.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Holes3578 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int h = Integer.parseInt(br.readLine());
		
		if (h == 0) sb.append("1\n");
		else if (h == 1) sb.append("0\n");
		else {
			if (h % 2 != 0) sb.append("4");
			for (int i = 1; i <= (h%2 != 0 ? (h-1)/2 : (h/2)); i++) {
				sb.append("8");
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}