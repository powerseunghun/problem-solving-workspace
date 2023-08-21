package Acmicpc.As.B1.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeumMinNumber1526 {
	static boolean check(int N) {
		int v = 0;
		while (N != 0) {
			v = N % 10;
			if (v != 4 && v != 7) return false;
			N /= 10;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		while (!check(N--)) {}
		
		System.out.println(N+1);
		br.close();
	}
}
