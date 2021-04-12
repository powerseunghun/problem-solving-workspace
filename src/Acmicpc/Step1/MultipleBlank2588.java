package Acmicpc.Step1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleBlank2588 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine()), tmp = B;
		
		while(tmp != 0) {
			System.out.println(A * (tmp % 10));
			tmp /= 10;
		}
		System.out.println(A * B);
	}
}
