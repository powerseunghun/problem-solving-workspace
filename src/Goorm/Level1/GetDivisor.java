package Goorm.Level1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetDivisor {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= input; i++) {
			if (input % i == 0) sb.append(i + " ");
		}
		
		System.out.println(sb.toString());
	}
}
