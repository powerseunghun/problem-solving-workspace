package Acmicpc.Step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddCycle1110 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), cycle = 0;
		int tmp = N, tmp2 = 0, sum = 0;
		
		do {
			sum = 0;
			tmp2 = tmp;
			cycle++;
			while(tmp2 != 0) {
				sum += tmp2 % 10;
				tmp2 /= 10;
			}
			tmp = ((tmp % 10) * 10 + sum % 10);
		}while(tmp != N);
		
		System.out.println(cycle);
	}
}
