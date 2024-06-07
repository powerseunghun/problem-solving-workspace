package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Граничныеклетки27213 {
	static int calc(int n, int m) {
		if (n == 1 || m == 1) return n+m-1;
		return (n*2) + (m*2) - 4;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		System.out.println(calc(n, m));
		br.close();
	}
}
