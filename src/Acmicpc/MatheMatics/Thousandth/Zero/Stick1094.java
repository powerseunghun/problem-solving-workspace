package Acmicpc.MatheMatics.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick1094 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String X = Integer.toBinaryString(Integer.parseInt(br.readLine()));
		int count = 0;
		for (int i = 0; i < X.length(); i++) {
			if (X.charAt(i)=='1') count++;
		}
		
		System.out.println(count);
	}
}
