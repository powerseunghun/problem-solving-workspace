package Acmicpc.As.B3.TenThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleCollatzSequence17869 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		int cnt = 0;
		
		while (N != 1) {
			N = N%2 == 0 ? N/2 : N+1;
			cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
