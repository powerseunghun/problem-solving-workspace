package Acmicpc.As.B5.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DoubleLoop34849 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(Math.pow(N, 2) <= 100000000 ? "Accepted" : "Time limit exceeded");
		br.close();
	}
}
