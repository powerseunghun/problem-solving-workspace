package Acmicpc.Step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine()), tmp = 0, i = 1;
		
		do {
			tmp += i;
			i++;
		} while(tmp < X);
		
		tmp = tmp >= X ? (tmp - X) + 1 : (X - tmp) + 1;
		
		if (i % 2 == 0) {
			System.out.println(tmp + "/" + (i - tmp));
		}
		else {
			System.out.println((i - tmp) + "/" + tmp);
		}
	}
}
