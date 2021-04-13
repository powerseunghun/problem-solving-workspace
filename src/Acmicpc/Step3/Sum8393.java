package Acmicpc.Step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum8393 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
}
