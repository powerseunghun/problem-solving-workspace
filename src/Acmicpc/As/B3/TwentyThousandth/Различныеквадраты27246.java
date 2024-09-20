package Acmicpc.As.B3.TwentyThousandth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Различныеквадраты27246 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		long v = 1, sum = 0;
		
		while(sum+v*v <= n) {
			sum += v*v;
			v++;
		}
		
		System.out.println(v-1);
		br.close();
	}
}
