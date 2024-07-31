package Acmicpc.As.B4.TwentyThousandth.Eight.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Торговыйцентр28648 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long res = 1000000000, n = 0, l = 0;
		String str = null;
		
		while(t-- > 0) {
			str = br.readLine();
			n = Long.parseLong(str.split(" ")[0]);
			l = Long.parseLong(str.split(" ")[1]);
			res = Math.min(res, n+l);
		}
		System.out.println(res);
		br.close();
	}
}
