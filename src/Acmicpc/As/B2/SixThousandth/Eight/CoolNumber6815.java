package Acmicpc.As.B2.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoolNumber6815 {
	static boolean check(int N) {
		boolean valid1 = Math.sqrt(N) - (int)Math.sqrt(N) == 0;
		boolean valid2 = Math.cbrt(N) - (int)Math.cbrt(N) == 0;
		return valid1 && valid2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = a; i <= b; i++) {
			if (check(i)) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
