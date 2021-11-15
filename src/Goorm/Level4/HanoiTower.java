package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiTower {
	static int count = 0;
	static void hanoi(int n) {
		count++;
		if (n == 1) return;
		hanoi(n-1);
		hanoi(n-1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		hanoi(N);
		System.out.println(count);
		
		br.close();
	}
}
