package Acmicpc.As.B5.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mathematics26545 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), sum = 0;
		
		while (T-- > 0) {
			sum += Integer.parseInt(br.readLine());
		}
		
		System.out.println(sum);
		br.close();
	}
}
