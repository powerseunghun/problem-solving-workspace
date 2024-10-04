package Acmicpc.As.B3.ThirtyThousandth.Two.Two;

import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BingoDefense32246 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N == 2 ? "3" : N);
		br.close();
	}
}
