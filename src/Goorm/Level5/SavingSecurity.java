package Goorm.Level5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SavingSecurity {
	static boolean isDivCountOdd(int n) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i * i == n) count+=1;
				else count+=2;
			}
		}
		return count % 2 != 0 ? true : false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(isDivCountOdd(N) ? "yes" : "no");
		br.close();
	}
}
