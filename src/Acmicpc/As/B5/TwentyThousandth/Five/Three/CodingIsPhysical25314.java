package Acmicpc.As.B5.TwentyThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingIsPhysical25314 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= (N/4); i++) {
			sb.append("long ");
		}
		sb.append("int\n");
		
		System.out.print(sb.toString());
		br.close();
	}
}
