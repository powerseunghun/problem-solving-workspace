package Acmicpc.As.B2.TwentyThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sushi20494 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			res += br.readLine().length();
		}
		
		System.out.println(res);
		br.close();
	}
}
