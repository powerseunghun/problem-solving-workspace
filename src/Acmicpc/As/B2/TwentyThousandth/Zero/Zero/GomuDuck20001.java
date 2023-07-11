package Acmicpc.As.B2.TwentyThousandth.Zero.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GomuDuck20001 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int res = 0;
		String str = br.readLine();
		
		while(true) {
			str = br.readLine();
			if (str.equals("고무오리 디버깅 끝")) break;
			switch(str) {
			case "문제":
				res++;
				break;
			case "고무오리":
				res = res == 0 ? res + 2 : res - 1;
				break;
			}
		}
		
		System.out.println(res);
		System.out.println(res == 0 ? "고무오리야 사랑해" : "힝구");
		br.close();
	}
}
