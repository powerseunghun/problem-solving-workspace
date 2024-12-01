package Acmicpc.As.B3.TwentyThousandth.Nine.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leiutajanumberüks29918 {
	static final int l = 5;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n0 = Integer.parseInt(str.split(" ")[0]); 
		int m0 = Integer.parseInt(str.split(" ")[1]), res = 0;
		
		for (int i = 0, n1 = 0, m1 = 0; i < l; i++) {
			str = br.readLine();
			n1 = Integer.parseInt(str.split(" ")[0]);
			m1 = Integer.parseInt(str.split(" ")[1]);
			res = Math.max(res, (n1-n0) + 10*(m1-m0)+1);
		}
		
		System.out.println(res);
		br.close();
	}
}
