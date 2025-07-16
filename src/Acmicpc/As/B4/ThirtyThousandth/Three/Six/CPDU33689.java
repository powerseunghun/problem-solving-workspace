package Acmicpc.As.B4.ThirtyThousandth.Three.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CPDU33689 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			if (br.readLine().charAt(0) == 'C') res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
