package Acmicpc.MatheMatics.FiveThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt5565 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int money = Integer.parseInt(br.readLine());
		for (int i = 0; i < 9; i++) {
			money -= Integer.parseInt(br.readLine());
		}
		System.out.println(money);
	}
}
