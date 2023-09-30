package Acmicpc.As.B1.TenThousandth.Nine.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Repeat19564 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 1;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) <= str.charAt(i-1)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
