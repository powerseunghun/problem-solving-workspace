package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShapePrint {
	static void print(int N) {
		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		print(N);
	}
}
