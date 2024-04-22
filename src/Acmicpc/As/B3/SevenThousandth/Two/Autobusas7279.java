package Acmicpc.As.B3.SevenThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Autobusas7279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str.split(" ")[0]);
		int K = Integer.parseInt(str.split(" ")[1]), a = 0, b = 0, cur = 0, res = 0;
		
		while(N-- > 0) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			b = Integer.parseInt(str.split(" ")[1]);
			cur += a;
			cur -= b;
			res = Math.max(res, Math.max(cur-K, 0));
		}
		
		System.out.println(res);
		br.close();
	}
}
