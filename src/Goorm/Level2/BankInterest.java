package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BankInterest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double money = Double.parseDouble(str.split(" ")[0]);
		double rate = Double.parseDouble(str.split(" ")[1]), interest = 0;
		int year = Integer.parseInt(str.split(" ")[2]);
		
		for (int i = 0; i < year; i++) {
			interest = (money * rate) / 100;
			money += interest;
		}
		
		System.out.printf("%.2f\n", money);
	}
}
