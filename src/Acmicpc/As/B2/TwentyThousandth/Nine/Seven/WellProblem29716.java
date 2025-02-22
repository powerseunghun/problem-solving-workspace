package Acmicpc.As.B2.TwentyThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WellProblem29716 {
	static int func(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == ' ') res++;
			else if (c >= 'A' && c <= 'Z') res+=4;
			else res+=2;
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int J = Integer.parseInt(str.split(" ")[0]), v = 0;
		int N = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		while(N-- > 0) {
			v = func(br.readLine());
			if (v <= J) res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
