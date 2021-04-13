package Acmicpc.Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumPrintWhile10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = 0, B = 0;
		String tmp = null;
		
		while(true) {
			tmp = br.readLine();
			A = Integer.parseInt(tmp.split(" ")[0]);
			B = Integer.parseInt(tmp.split(" ")[1]);
			
			if (A == 0 && B == 0) break;
			
			System.out.println(A + B);
		}
		
	}
}
