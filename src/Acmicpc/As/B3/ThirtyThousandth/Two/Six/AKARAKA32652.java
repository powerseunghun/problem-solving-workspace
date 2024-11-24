package Acmicpc.As.B3.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AKARAKA32652 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("AKARAKA");
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < K-1; i++) {
			sb.append("RAKA");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
