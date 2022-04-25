package Acmicpc.OrderSubmit.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VeraAndOutfits15439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(N * (N-1));
		br.close();
	}
}
