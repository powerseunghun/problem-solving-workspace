package Acmicpc.As.B3.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AirfareGrants32661 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, P = 0;
		
		while(N-- > 0) {
			P = Integer.parseInt(br.readLine());
			max = Math.max(max, P);
			min = Math.min(min, P);
		}
		
		System.out.println(Math.max(0, min-max/2));
		br.close();
	}
}
