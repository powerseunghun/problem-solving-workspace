package Acmicpc.As.B2.TwentyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheBattleOfGiants23854 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		System.out.println(a%3!=b%3 ? "-1" : (a/3) + " " + (a%3) + " " + (b/3));
		br.close();
	}
}
