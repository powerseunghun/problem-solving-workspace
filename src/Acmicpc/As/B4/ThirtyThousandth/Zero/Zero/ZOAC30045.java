package Acmicpc.As.B4.ThirtyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZOAC30045 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), res = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			res = str.contains("01") || str.contains("OI") ? res+1 :res;
		}
		
		System.out.println(res);
		br.close();
	}
}
