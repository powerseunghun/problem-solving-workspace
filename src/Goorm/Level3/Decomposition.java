package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decomposition {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), tmp = N;
		int count = 0, sum = 0;
		boolean flag = false;
		
		while (tmp != 0) {
			count++;
			tmp /= 10;
		}
		System.out.println(count);
		
		System.out.println(N-(count*9));
		for (int i = N - (count * 9); i <= N; i++) {
			sum = 0;
			tmp = i;
			while (tmp != 0) {
				sum += tmp % 10;
				tmp /= 10;
			}
			
			if (sum + i == N) {
				flag = true;
				System.out.println(i);
				break;
			}
		}
		if (!flag) System.out.println(0);
	}
}
