package Acmicpc.Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divide1075 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), i = 0, tmp = 0;
		int F = Integer.parseInt(br.readLine());
		N = N / 100 * 100;
		tmp = N;
		
		for (i = 0; i <= 99; i++) {
			tmp += i;
			if (tmp % F == 0) {
				break;
			}
			tmp = N;
		}
		
		if (i < 10) {
			System.out.print("0");
		}
		System.out.println(i);
	}
}
