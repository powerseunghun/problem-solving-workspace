package Acmicpc.As.B4.ThirtyThousandth.One.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReSignUp31822 {
	static final int limit = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine().substring(0, limit), c = null;
		int N = Integer.parseInt(br.readLine()), res = 0;
		
		while(N-- > 0) {
			c = br.readLine().substring(0, limit);
			res = c.equals(str) ? res+1 : res;
		}
		
		System.out.println(res);
		br.close();
	}
}
