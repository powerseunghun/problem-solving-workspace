package Acmicpc.As.B2.NineThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarshipHakodateMaru9151 {
	static int cubic(int i) {
		return (int)Math.pow(i, 3);
	}
	static int tetra(int i) {
		return i*(i+1)*(i+2)/6;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, res = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			res = 0;
			
			for (int i = 0; Math.pow(i, 3) <= n; i++) {
				for (int j = 0; cubic(i)+tetra(j) <= n; j++) {
					res = Math.max(res, cubic(i)+tetra(j));
				}
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
