package Acmicpc.As.B3.TwentyThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GiftExpireDate28454 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine().replaceAll("-", "")), v = 0;
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			v = Integer.parseInt(br.readLine().replaceAll("-", ""));
			if (c <= v) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
