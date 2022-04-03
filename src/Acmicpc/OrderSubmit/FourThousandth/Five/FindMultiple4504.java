package Acmicpc.OrderSubmit.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindMultiple4504 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), num = 0;
		
		while (true) {
			num = Integer.parseInt(br.readLine());
			if (num == 0) break;
			
			if (num % N == 0) sb.append(num + " is a multiple of " + N + ".\n");
			else sb.append(num + " is NOT a multiple of " + N + ".\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
