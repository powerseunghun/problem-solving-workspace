package Acmicpc.String.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MarsMath5355 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double res = 0;
		StringTokenizer st = null;
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			res = Double.parseDouble(st.nextToken());
			while (st.hasMoreTokens()) {
				switch(st.nextToken()) {
				case "@":
					res *= 3;
					break;
				case "%":
					res += 5;
					break;
				case "#":
					res -= 7;
					break;
				}
			}
			System.out.printf("%.2f\n", res);
		}
	}
}
