package Acmicpc.As.B2.TwentyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bitaro24073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		boolean flag = false;
		
		for (int i = 0; i < str.length()-2; i++) {
			if (str.charAt(i) == 'I') {
				for (int j = i+1; j < str.length()-1; j++) {
					if (str.charAt(j) == 'O') {
						for (int k = j+1; k < str.length(); k++) {
							if (str.charAt(k) == 'I') {
								flag = true;
							}
						}
					}
				}
			}
		}
		
		System.out.println(flag ? "Yes" : "No");
		br.close();
	}
}
