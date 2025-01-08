package Acmicpc.As.B3.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NotRotateCalipers30394 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int V = 0;
		
		while(N-- > 0) {
			V = Integer.parseInt(br.readLine().split(" ")[1]);
			max = Math.max(max, V);
			min = Math.min(min, V);
		}
		
		System.out.println(max-min);
		br.close();
	}
}
