package Acmicpc.As.B4.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdvanceToTaoyuanRegional30319 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println(br.readLine().compareTo("2023-09-16") <= 0 ? "GOOD" : "TOO LATE");
		br.close();
	}
}
