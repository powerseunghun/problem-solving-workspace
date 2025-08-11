package Acmicpc.As.B3.ThirtyThousandth.Three.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BackAndForth33779 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		boolean flag = true;
		
		for (int i = 0; i < str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				flag = false;
			}
		}
		
		System.out.println(flag ? "beep" : "boop");
		br.close();
	}
}
