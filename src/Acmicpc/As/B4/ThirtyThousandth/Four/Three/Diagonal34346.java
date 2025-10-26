package Acmicpc.As.B4.ThirtyThousandth.Four.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Diagonal34346 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println((N&1) != 0 ? "1" : "2");
		br.close();
	}
}
