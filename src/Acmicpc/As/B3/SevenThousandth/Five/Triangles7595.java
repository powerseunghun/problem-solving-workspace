package Acmicpc.As.B3.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangles7595 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j <= i; j++) {
					sb.append("*");
				}
				sb.append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
