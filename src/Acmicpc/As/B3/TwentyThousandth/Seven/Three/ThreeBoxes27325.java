package Acmicpc.As.B3.TwentyThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeBoxes27325 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int loc = 1, res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			loc = str.charAt(i) == 'L' ? loc == 1 ? 1 : loc-1 : loc == 3 ? 3 : loc+1;
			res = loc == 3 ? res + 1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
