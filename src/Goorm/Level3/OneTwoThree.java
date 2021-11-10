package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThree {
	static int count = 0;
	static void search(int n, int sum) {
		if (sum >= n) {
			if (sum == n) count++;
			return;
		}
		
		for (int i = 1; i <= 3; i++) {
			search(n, sum + i);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		search(N, 0);
		System.out.println(count);
		
		br.close();
	}
}
