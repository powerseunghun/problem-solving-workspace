package Goorm.AlgorithmHeroes.T3;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class NumberOfSquare {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		long tmp = N * (N+1) * (2*N+1);
		
		System.out.println(tmp/6);
	}
}
