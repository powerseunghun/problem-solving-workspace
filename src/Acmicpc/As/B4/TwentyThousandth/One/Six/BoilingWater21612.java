package Acmicpc.As.B4.TwentyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BoilingWater21612 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		int P = B * 5 - 400;
		
		System.out.println(P);
		System.out.println(P == 100 ? 0 : P > 100 ? -1 : 1);
		br.close();
	}
}
