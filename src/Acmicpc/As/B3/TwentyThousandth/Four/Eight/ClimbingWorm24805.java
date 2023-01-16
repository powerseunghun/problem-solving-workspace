package Acmicpc.As.B3.TwentyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbingWorm24805 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int h = Integer.parseInt(tmp.split(" ")[2]), cur = 0, res = 0;
		
		while(true) {
			res++;
			cur += a;
			if (cur >= h) break;
			cur -= b;
		}
		
		System.out.println(res);
		br.close();
	}
}
