package Acmicpc.As.B3.ThirtyThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JacobiNumbers35213 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), w = 0;
		
		while(Math.pow(w+1, 3) <= n) {
			w++;
		}
		
		sb.append((int)(n-(Math.pow(w, 3))+1)).append("\n");
		sb.append(w).append(" ");
		for (int i = 0; i < (int)(n-Math.pow(w, 3)); i++) {
			sb.append(1).append(" ");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
