package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NarcissisticNumber {
	static int getNarNumber(int N) {
		int sum = 0, val = 0;
		while (N != 0) {
			val = N%10;
			sum += Math.pow(val, 3);
			N /= 10;
		}
		return sum;
	}
	static boolean isNarNumber(int N) {
		if (N == getNarNumber(N)) return true;
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int s = Integer.parseInt(tmp.split(" ")[0]);
		int e = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = s; i <= e; i++) {
			if (isNarNumber(i)) sb.append(i + " ");
		}
		
		System.out.print(sb.toString());
	}
}
