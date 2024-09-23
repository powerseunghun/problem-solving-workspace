package Acmicpc.As.B3.TwentyThousandth.Nine.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Логины29108 {
	static boolean func(String str) {
		if (str.length() <= 2) return false;
		if (str.substring(0, 2).equals("io") && str.substring(2, str.length()).matches("^[0-9]*$")) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(func(str) ? "Correct" : "Incorrect");
		br.close();
	}
}
