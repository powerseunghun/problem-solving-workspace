package CodeUp.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UniversalRecycleBin1180 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(new StringBuilder(br.readLine()).reverse().toString()) * 2;
		System.out.println(n %= 100);
		if (n <= 50) {
			System.out.println("GOOD");
		}
		else {
			System.out.println("OH MY GOD");
		}
	}
}
