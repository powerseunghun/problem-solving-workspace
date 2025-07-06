package Acmicpc.As.B5.ThirtyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhygalCup33612 {
	static final int y = 2024, m = 1, g = 7;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(y+(g*N/12) + " " + (m+(g*N%12)));
		br.close();
	}
}
