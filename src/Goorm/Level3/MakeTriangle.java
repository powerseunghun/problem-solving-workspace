package Goorm.Level3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MakeTriangle {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), c = 0, count = 0;
		
		for (int a = 1; a < N; a++) {
			for (int b = a; b < N; b++) {
				c = N-(a+b);
				if (c < b) break;
				else if ((a+b) > c) count++;
			}
		}
		System.out.println(count);
	}
}
