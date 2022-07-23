package Acmicpc.As.B4.TwentyThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GamblingForFun23795 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int m = 0, sum = 0;
		while (true) {
			m = Integer.parseInt(br.readLine());
			if (m == -1) break;
			
			sum += m;
		}
		
		System.out.println(sum);
		br.close();
	}
}
