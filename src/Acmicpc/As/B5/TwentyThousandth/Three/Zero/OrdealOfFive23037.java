package Acmicpc.As.B5.TwentyThousandth.Three.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrdealOfFive23037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		// Math.pow(9, 5) = 59049, * 6 = 354294
		int sum = 0;
		
		for (int i = 0; i < tmp.length(); i++) {
			sum += Math.pow(tmp.charAt(i)-'0', 5);
		}
		
		System.out.println(sum);
		br.close();
	}
}
