package Acmicpc.As.B3.ThirtyThousandth.Zero.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kick30329 {
	static final String target = "kick";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length()-target.length()+1; i++) {
			if (str.substring(i, i+target.length()).equals(target)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
