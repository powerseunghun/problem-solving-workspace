package Acmicpc.As.B5.TwentyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CupcakeParty24568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.parseInt(br.readLine());
		int S = Integer.parseInt(br.readLine());
		
		System.out.println((R*8) + (S*3) - 28);
		br.close();
	}
}
