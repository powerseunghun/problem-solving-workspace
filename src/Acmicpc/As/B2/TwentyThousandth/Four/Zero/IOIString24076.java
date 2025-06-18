package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOIString24076 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		br.readLine();
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			if ((i & 1) != 0) {
				res += (str.charAt(i) != 'O' ? 1 : 0); 
			} else {
				res += (str.charAt(i) != 'I' ? 1 : 0);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
