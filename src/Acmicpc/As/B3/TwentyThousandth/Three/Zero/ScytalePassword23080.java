package Acmicpc.As.B3.TwentyThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScytalePassword23080 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i+=K) {
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
