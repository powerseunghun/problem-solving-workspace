package Acmicpc.As.B3.TwentyThousandth.Nine.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Алексистейк29283 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long k = Long.parseLong(br.readLine()), res = 0;
		
		for (int i = 0; i < k; i++) {
			res += (i/5+1) * 30;
		}
		
		System.out.println(res);
		br.close();
	}
}
