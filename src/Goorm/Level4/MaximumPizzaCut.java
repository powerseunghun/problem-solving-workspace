package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumPizzaCut {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		n = (int)Math.pow(n, 2) + n + 2;
		
		System.out.println(n/2);
	}
}
