package Acmicpc.As.B4.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Yalda33191 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int b = Integer.parseInt(br.readLine());
		int w = Integer.parseInt(br.readLine());
		int p = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		System.out.println(b >= w ? "Watermelon" : b >= p ? "Pomegranates" : b >= n ? "Nuts" : "Nothing");
		br.close();
	}
}
