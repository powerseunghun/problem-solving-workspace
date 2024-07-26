package Acmicpc.As.B3.ThirtyThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPosition30821 {
	static final int a = 5;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		long res = 1;
		
		for (int i = 0; i < a; i++) {
			res *= (N-i);
		}
		for (int i = 0; i < a; i++) {
			res /= (i+1);
		}
		
		System.out.println(res);
		br.close();
	}
}
