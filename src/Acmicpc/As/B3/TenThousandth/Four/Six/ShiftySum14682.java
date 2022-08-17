package Acmicpc.As.B3.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftySum14682 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine()), sum = 0;
		
		for(int i = 0; i <= K; i++) {
			sum += N * Math.pow(10, i);
		}
		
		System.out.println(sum);
		br.close();
	}
}
