package Acmicpc.As.B3.ThirtyThousandth.One.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaperCut31472 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int W = Integer.parseInt(br.readLine());
		
		System.out.println((int)(Math.sqrt(W*2) * 4));
		br.close();
	}
}
