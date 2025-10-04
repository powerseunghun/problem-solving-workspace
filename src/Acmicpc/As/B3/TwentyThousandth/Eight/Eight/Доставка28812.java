package Acmicpc.As.B3.TwentyThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Доставка28812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int C = Integer.parseInt(str.split(" ")[1]);
		int p = 0, d = 0, v = 0, res = Integer.MAX_VALUE;
		
		while(n-- > 0) {
			str = br.readLine();
			p = Integer.parseInt(str.split(" ")[0]);
			d = Integer.parseInt(str.split(" ")[1]);
			v = Integer.parseInt(str.split(" ")[2]);
			
			res = Math.min(p+d+v*C, res);
		}
		
		System.out.println(res);
		br.close();
	}
}
