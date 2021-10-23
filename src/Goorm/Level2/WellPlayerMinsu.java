package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WellPlayerMinsu {
	static int getMinDivisor(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return i;
		}
		return n;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		
		if (a != b) System.out.println("2");
		else System.out.println(getMinDivisor(a));
		// https://dar0m.tistory.com/92
		// djdldjqtsp..
	}
}
