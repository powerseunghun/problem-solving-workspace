package Acmicpc.As.B4.TenThousandth.Nine.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DogTreats19602 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int L = Integer.parseInt(br.readLine());
		int sum = S + (2 * M) + (3 * L);
		
		if (sum >= 10) System.out.println("happy");
		else System.out.println("sad");
		
		br.close();
	}
}
