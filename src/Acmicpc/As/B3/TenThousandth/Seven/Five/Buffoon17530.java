package Acmicpc.As.B3.TenThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffoon17530 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), val = 0, max = Integer.parseInt(br.readLine());
		boolean flag = true;
		
		for (int i = 0; i < N-1; i++) {
			val = Integer.parseInt(br.readLine());
			if (val > max) {
				flag = false;
				break;
			}
		}
		
		System.out.println(flag ? "S" : "N");
		br.close();
	}
}
