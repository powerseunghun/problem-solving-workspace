package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CollatzConjecture13236 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		sb.append(n);
		
		while (n != 1) {
			n = n%2 == 0 ? n/2 : 3*n+1;
			sb.append(" " + n);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
