package Acmicpc.As.B5.ThirtyThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tuesday31611 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		
		System.out.println(X%7 == 2 ? 1 : 0);
		br.close();
	}
}
