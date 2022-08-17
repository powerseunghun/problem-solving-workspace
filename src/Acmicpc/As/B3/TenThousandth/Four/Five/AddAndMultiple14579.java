package Acmicpc.As.B3.TenThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddAndMultiple14579 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int fa = ((a+1)*a)/2;
		int res = fa;
		
		for (int i = a+1; i <= b; i++) {
			res *= (fa+=i);
			res %= 14579;
		}
		
		System.out.println(res);
		br.close();
	}
}
