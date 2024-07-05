package Acmicpc.As.B3.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WatermelonGame31868 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]);
		
		for (int i = 0; i < N-1; i++) {
			K/=2;
		}
		
		System.out.println(K);
		br.close();
	}
}
