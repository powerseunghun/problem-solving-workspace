package Acmicpc.As.B2.FiveThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarbonatedDrinks5032 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int e = Integer.parseInt(tmp.split(" ")[0]);
		int f = Integer.parseInt(tmp.split(" ")[1]);
		int c = Integer.parseInt(tmp.split(" ")[2]), t = e+f, n = 0, res = 0;
		
		while (t >= c) {
			res += t/c;
			n = t;
			t -= t/c*c;
			t += n/c;
		}
		
		System.out.println(res);
		br.close();
	}
}
