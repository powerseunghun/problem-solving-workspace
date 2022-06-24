package Acmicpc.As.B4.TwentyThousandth.Zero.Eight;

import java.awt.image.BufferedImageFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kuber20833 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= N; i++) {
			res += Math.pow(i, 3);
		}
		System.out.println(res);
		br.close();
	}
}
