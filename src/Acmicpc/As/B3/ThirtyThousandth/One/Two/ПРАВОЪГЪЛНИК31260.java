package Acmicpc.As.B3.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ПРАВОЪГЪЛНИК31260 {
	static void func(long res) {
		System.out.println(res/100 + " " + res % 100);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		long x = Long.parseLong(str.split(" ")[0]);
		long y = Long.parseLong(str.split(" ")[1]);
		long d = Long.parseLong(br.readLine());
		long r = (x*100+y) - (2*d);
		long res1 = r/4+d, res2 = r/4;
		
		func(res1);
		func(res2);
		
		br.close();
	}
}
