package Acmicpc.As.B3.ThirtyThousandth.Two.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuildingPyramids32585 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(n*(n+1)*(n+2)/6);
		br.close();
	}
}
